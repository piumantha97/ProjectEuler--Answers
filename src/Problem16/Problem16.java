package Problem16;

import java.math.BigInteger;

public class Problem16 {
    static int sum =0;
    public static void count(String k)
    {
        char[] digits1 = k.toCharArray();
        for (int i = 0; i <digits1.length ; i++) {
            int a=Character.getNumericValue(digits1[i]);

            sum= sum+a;
        }
        System.out.println();
        System.out.println(sum);
    }
    public static void main(String[] args) {
  BigInteger s;
        s =new  BigInteger("2");
        int exponent=1000;
        BigInteger result = s.pow(exponent);
        System.out.println(result);
String k = result.toString();
        count(k);
    }
}
