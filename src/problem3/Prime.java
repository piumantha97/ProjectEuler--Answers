package problem3;

public class Prime {

    public static void main(String []args)
    {

        long k = 40086 ;// The  maximum number that 32 bit can represent is 4,294,967,296, so  larger numbes should use L at the end for notify as Long number
        long max =1;
       long prime =1;
          for(long i=2; i<k ;i++)
          {

              if(k %i == 0)
              {
                  int count =0;
                  for (long j=2; j<i;j++)
                  {
                      if(i%j == 0) {
                          count++;
                      }

                  }
                  if (count == 0)
                  {
                      prime =i;
                      System.out.println(prime);
                  }

              }

              if (max<prime)
              {
                  max = prime;
              }
          }


        System.out.println(max);
    }
}
