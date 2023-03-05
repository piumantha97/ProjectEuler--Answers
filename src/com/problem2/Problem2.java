package com.problem2;


public class Problem2
{
    public static void main (String [] args)
    {
        int sum =0;
        int  x=1;
        int y=2;
        int z= x+y;
        while (z<4000000) {
            x = y;
            y = z;
            z = x + y;

            if(z%2==0)
            {
                sum=sum+z;
            }

        }
        sum=sum+2;
        System.out.println("sum of "+ sum);

    }
}
