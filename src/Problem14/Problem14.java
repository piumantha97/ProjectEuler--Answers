package Problem14;

public class Problem14 {
    public static int check(long start) {



            int max_count = 1;


                int count = 1;
                long value = start;
                while (value != 1) {

                    if (value % 2 == 0) {
                        value = value / 2;

                    } else {
                        value = 3 * value + 1;
                    }
                    count++;
//
//                    if (max_count < count) {
//                        max_count = count;
//                    }

                }
return count;
            }

//            if (max_count < count)
//            {
//                max_count = count;
//            }

            //    }
            //   System.out.println(count);
     //   }

        public static void main (String[]args)
        { long maxcount=1;
            int maxStarter =0;
            for (int start = 1; start < 1000000; start++) {

              long Acount=  check(start);
          //  System.out.println(Acount +" "+ start);
            if (maxcount<Acount)
            {
                maxcount=Acount;
                 maxStarter =start;
            }
          }
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println(maxcount + " " +  maxStarter);
        }


}