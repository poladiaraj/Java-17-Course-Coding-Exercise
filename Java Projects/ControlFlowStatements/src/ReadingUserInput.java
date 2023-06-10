import java.util.Scanner;

public class ReadingUserInput {
    public static void main(String[] args) {
        //testUserInput();
        readingUserInputChallenge(3);
    }

    private static void readingUserInputChallenge(int numbersToCount) {
        Scanner scanner = new Scanner(System.in);
        int validNumberCounter = 1;
        int sum = 0;
        boolean isValidNumber;
        while(validNumberCounter <= numbersToCount) {
            System.out.print("Enter number #" + validNumberCounter + ": ");
            isValidNumber = scanner.hasNextInt();

            if(isValidNumber) {
                validNumberCounter++;
                sum+=scanner.nextInt();
            } else {
                System.out.println("Invalid number.");
                scanner.next();
            }
        }
        System.out.println("Sum of entered numbers = " + sum);
        scanner.close();
    }

    private static void testUserInput() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        boolean hasNextInt = scanner.hasNextInt();

        if(hasNextInt == false) {
            System.out.println("Input is not an integer");
        } else {
            int input = scanner.nextInt();
            System.out.println("Input is: " + input);
        }
        scanner.close();
    }
}
