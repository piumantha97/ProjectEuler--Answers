package problem3;

public class Prime2 {
    public static void main(String args[]) {
        long k =600851475143L

                ;
        long prime = 2;
        for (long i = k - 1; i > 1; i--) {
            if (k % i == 0) {
                int count = 0;
                for (long j = 2; j < i; j++) {
                    if (i % j == 0) {
                        count++;
                    }
                }
                if (count == 0) {
                    prime = i;
                    System.out.println("Largest prime " + prime);
                    break;// if prime found it is the largest prime. So loop will stop

                }

            }
            if (prime > 2 ) {
                break;
            }


        }
    }
}






