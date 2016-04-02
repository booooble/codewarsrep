/*
Returns abbreviation of the String input in format: 1st letter + amount of removed letters + last letter.
Example: "abbreviation-satisfaction yabadabadoo babe" -> "a10n-s10n y9o b2e"
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Abbreviator {

    public String abbreviate(String string) {
        StringBuilder sb = new StringBuilder();
        if(string != null && string != "") {
            char[] ch = string.replaceAll("[A-Za-z]+", "").toCharArray();
            String[] str = string.split("[ -]+");
            for(int i = 0; i < str.length; i++) {
                String x = str[i];
                if (x.length() > 1) {
                    if (string.length() < 3) {
                        sb.append(x);
                    }
                    else {
                        long length = x.length() - 2;
                        sb.append(x.substring(0, 1) + length + x.substring(x.length() - 1));
                    }
                    if(ch.length != 0 && i < ch.length){
                        sb.append(String.valueOf(ch[i]));
                    }
                }
            }
        }
        else {
            return "String is invalid.";
        }
        return sb.toString();
    }

    /*
    Returns double[] of n numbers of the tribonacci sequence.
    Example: {1.0, 1.0, 1.0}, n = 10 -> [1.0, 1.0, 1.0, 3.0, 5.0, 9.0, 17.0, 31.0, 57.0, 105.0]
    */
    public double[] tribonacci(double[] s, int n) {
        double[] result;
        int count = 0;
        if(s.length == 0 || s == null || n < 3) {
            return new double[0];
        }
        if(s.length >= 3) {
            result = Arrays.copyOf(s, n);
            while(count < n - s.length) {
                int inputIndex = s.length + count;
                result[s.length + count] = result[inputIndex - 1] + result[inputIndex - 2] + result[inputIndex - 3];
                count++;
            }
        }
        else {
            throw new IllegalArgumentException("Input is incorrect");
        }
        return result;
    }

    public static  void main(String[] args){
//        System.out.println(new Abbreviator().abbreviate("abbreviation-satisfaction yabadabadoo babe"));
        System.out.println(new Abbreviator().tribonacci(new double[]{1.0,1.0,1.0}, 10));
    }
}