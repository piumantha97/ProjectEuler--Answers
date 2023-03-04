package com.company;

public class Problem2
{
    public static void main (String [] args)
    {
        int sum =0;// to get the sum of even numbers
        int  x=1; //initial values
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
        sum=sum+2; //adding miissing value to sum;(initial value of y);
        System.out.println("sum of "+ sum);

}
}
