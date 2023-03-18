package Problem15;

import java.math.BigInteger;

public class Problem15 {
    public static BigInteger recursion(BigInteger k){
       BigInteger b = BigInteger.ONE;
        BigInteger c = BigInteger.ONE;
       while(k.compareTo(BigInteger.ZERO)>0)
        {
           // System.out.println("hi"+k);
           b= k.multiply(recursion(k.subtract(BigInteger.ONE))) ;
           break;
        }
        return b;

    }

    public static void main(String[] args) {
        System.out.println(recursion(BigInteger.valueOf(40)).divide(recursion(BigInteger.valueOf(20))).divide((recursion(BigInteger.valueOf(20)))));

    }
}
