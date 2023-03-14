package Problem9;

public class Problem9 {
    public static int check()
    {
        int sum =0;
        for (int i =0; i<1000;i++)
        {
            for (int j=i+1;j<1000;j++)
            {
                for (int k=j+1;k<1000;k++)
                {
                    sum =i+j+k;
                    if(sum == 1000) {
                        int pi = (int) (Math.pow(i,2) +  Math.pow(j,2));
                        if (k * k == pi)
                        {
                           // return i + " "+ j+ " "+ k;
                            return i*j*k;

                        }
                    }
                }
            }
        }
        return -99;
    }
    public static void main(String [] args)
    {

        System.out.println(check());

    }

}
