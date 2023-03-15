package Problem12;

import java.math.BigInteger;

public class Problem12 {
    public static void divtrangle() {
        boolean b = false;

        long i = 1;
       long n = 1;

        while (b == false) {
            int count = 0;



            i = n * (n + 1) / 2;

            n++;
           long j = 1;
            {
                while (j <= i) {
                    if (i % j == 0) {
                        count++;
                    }
                    if (count == 501) {
                        b = true;
                    }
                    j++;
                }
            }

        }
        System.out.println(i);
    }
    public static void main (String []args)
    {
divtrangle();
    }
}

