public class Sum3And5 {
    public static void main(String[] args) {
        printSum3And5();
    }

    private static void printSum3And5() {
        int count = 0;
        int sum = 0;
        for(int i=1; i<=1000; i++) {
            if(i%15 == 0) {
                System.out.println(i + " is divisible by both 3 and 5.");
                sum+=i;
                count++;
                if(count == 5) {
                    System.out.println("Sum of above 5 numbers = " + sum);
                    break;
                }
            }

        }
    }
}
