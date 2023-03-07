package Problem5;

public class Problem5 {
    static boolean check(int k)
    {
        int i=2;
        while (i <= 20)
        {
            if(k%i ==0 ) {
                i++;
            }
            else {
                break;
            }
        }
        if(i == 21) {
            return true;
        }
        return false;
    }


    public static void main (String [] args)
    {
        int j = 2;
        while(check(j) == false)
        {
            j++;

        }
        System.out.println(j);
     //   System.out.println(check(2520));

    }
}
