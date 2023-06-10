public class ForLoop {
    public static void main(String[] args) {
        //calculateInterest();
        printPrimeNumbers(10);
    }

    private static void calculateInterest()
    {
        for (int i=2; i<9; i++) {
            System.out.println("10,000 at " + i + "% = " + String.format("%.2f", calculateInterest(10000,i)));
        }

        for (int i=8; i>1; i--) {
            System.out.println("10,000 at " + i + "% = " + String.format("%.2f", calculateInterest(10000,i)));
        }
    }

    private static double calculateInterest(double amount, double interestRate) {
        return (amount * (interestRate/100));
    }

    private static void printPrimeNumbers(int number) {
       int count = 0;

        for(int i=1; i<=100; i++) {
            if(isPrime(i)) {
                count++;
                System.out.println("Number " + i + " is a prime number");
                if(count == number) {
                    System.out.println("Exiting for loop");
                    break;
                }
            }
        }
    }

    private static boolean isPrime(int n) {
        if(n == 1) {
            return false;
        }

        for(int i=2; i <= Math.sqrt(n); i++) {
            if(n % i == 0)
                return false;
        }

        return true;
    }
}
