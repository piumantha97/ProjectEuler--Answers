package Problem4;

public class Problem4 {

    public static int checkPalindrome(int n)
    {
        int m=n;
        int sum =0;
        while (m>0) {
            int r = m % 10;
            sum = (sum * 10) + r;
            m=m/10;
        }
        if (sum == n )
        {
           return n;// exit from the method while returning n

        }

        return -99;
    }
    public static void main (String[] args)
    {
        int max =0;
        int a=0,b=0;
        int x=0,y=0;
        for(int i =999; i>99 ;i--)
        {
            for(int j = 999;j>99;j--)
            {
                int k =i*j;

              a = checkPalindrome(k);
              if( a >max)
              {
                  max= a;
                  x=i;
                  y=j;
              }
            }
           }
        System.out.println(max);
        System.out.println(x+ " " + y);

        //System.out.println( checkPalindrome(454));
       }



    }
















