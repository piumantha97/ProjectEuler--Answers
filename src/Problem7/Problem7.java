package Problem7;

public class Problem7 {
    public static void main (String[] args)
    { int count = 0;
        int prime= 0;

        for (int i = 2; count< 6;i++)
        {
            int factors = 0;
            int j = i-1;
            while(j>1) {
                if (i%j==0)
                {
                    factors++;
                    break;

                }
               j--;
            }
            if (factors == 0)
            {
                prime=i;
                count ++;
                System.out.println(prime);
            }
          //  System.out.println(prime);
        }

    }
}
