/*
Returns abbreviation of the String input in format: 1st letter + amount of removed letters + last letter.
Example: "abbreviation-satisfaction yabadabadoo babe" -> "a10n-s10n y9o b2e"
 */

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

    public static  void main(String[] args){
        System.out.println(new Abbreviator().abbreviate("abbreviation-satisfaction yabadabadoo babe"));
    }
}