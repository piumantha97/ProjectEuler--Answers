package Problem20;

import java.math.BigInteger;

public class Problem20 {
   static  BigInteger mul= BigInteger.valueOf(1);
    public static BigInteger factorial(BigInteger x)
    {

        while(x.compareTo(BigInteger.ZERO)>0)
        {
           // System.out.println(x);
            mul= x.multiply(factorial(x.subtract(BigInteger.ONE))) ;

           // System.out.println(mul);
break;

        }
        return mul;
    }
    static int sum =0;
    public static void count(BigInteger L)
    {
        System.out.println(L);
        String k= L.toString();
    //    System.out.println(" :"+k);
        char[] digits1 = k.toCharArray();
        for (int i = 0; i <digits1.length ; i++) {
            int a=Character.getNumericValue(digits1[i]);

            sum= sum+a;
        }
        System.out.println();
        System.out.println(sum);
    }


    public static void main(String[] args) {
       // System.out.println(factorial(BigInteger.valueOf(10)));
        BigInteger result =factorial(BigInteger.valueOf(100));
      //  System.out.println(result);
        count(result);
    }
}
