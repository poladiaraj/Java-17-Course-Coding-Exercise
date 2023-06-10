public class DigitSum {
    public static void main(String[] args) {
        System.out.println(sumDigits(-10));
        System.out.println(sumDigits(0));
        System.out.println(sumDigits(10));
        System.out.println(sumDigits(123));
        System.out.println(sumDigits(100801));
    }

    private static int sumDigits(int number) {
        if(number >= 10) {
            return calculateSumOfDigits(number);
        }
        return -1;
    }

    private static int calculateSumOfDigits(int number) {
        int sum = 0;
        while(number > 0) {
            sum += number%10;
            number/=10;
        }
        return sum;
    }
}
