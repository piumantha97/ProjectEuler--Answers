package problem6;

public class Problem6 {
    public static int sumOfSqures(){
        int sum =0;
        for (int i = 0 ; i< 101; i++)
        {
          sum = sum + i*i;
        }
        return sum;
    }
    public static int squreOfSum(){
        int sum =0;
        for (int i = 0 ; i< 101; i++)
        {
            sum = sum + i;
        }
        sum = sum*sum;
        return sum;
    }

public static void main (String[] args)
{
  int b =sumOfSqures();
  int a =squreOfSum();
    System.out.println(a-b);

}
}
