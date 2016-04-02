import java.util.Arrays;

public class NumHelper {

    /*
    Returns double[] of n numbers of the tribonacci sequence.
    Example: [1.0, 1.0, 1.0], n = 10 --> [1.0, 1.0, 1.0, 3.0, 5.0, 9.0, 17.0, 31.0, 57.0, 105.0]
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
            throw new IllegalArgumentException("Input is invalid");
        }
        return result;
    }

    /*
    Xbonacci function takes a signature of X elements and returns the first n elements of the sequence where
    each next element is the sum of the last X elements.
    Examples:   [1,1,1,1], n = 10 --> [1,1,1,1,4,7,13,25,49,94]
                [0,0,0,0,1], n = 10 --> [0,0,0,0,1,1,2,4,8,16]
                [1,0,0,0,0,0,1], n = 10 --> [1,0,0,0,0,0,1,1,2,4]
     */
    public double[] xbonacci(double[] signature, int n) {
        int x = signature.length;
        double[] result;
        int count = 0;
        if(signature.length == 0 || signature == null || n < x) {
            return new double[0];
        }
        if(signature.length >= 2) {
            result = Arrays.copyOf(signature, n);
            while(count < n - signature.length) {
                int inputIndex = signature.length + count;
                double nextElement = 0.0;
                for(int i = 1; i <= x; i++) {
                    nextElement += result[inputIndex - i];
                }
                result[signature.length + count] = nextElement;
                count++;
            }
        }
        else {
            throw new IllegalArgumentException("Input is invalid");
        }
        return result;
    }

    public static  void main(String[] args){
        System.out.println(new NumHelper().tribonacci(new double[]{1.0,1.0,1.0}, 10));
        System.out.println(new NumHelper().xbonacci(new double[]{1.0,1.0,1.0}, 10));
    }
}