package Problem10;

import java.math.BigInteger;

public class Problem10 {
    public static void prime()
    {
      BigInteger sum = BigInteger.valueOf(0);
        for(int i=2;i<2000000;i++)
        {
            int count =0;
            int j=2;
            while(j<i)
            {
                if(i%j ==0)
                {
                    count++;
                    break;
                }

                j++;
            }
            if(count == 0)
            {
                BigInteger big_integer = BigInteger.valueOf(i);
               sum = sum.add(big_integer) ;
            }

        }
        System.out.println(sum);
    }
    public static void main (String [] args)
    {
        prime();
    }
}
