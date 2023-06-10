import java.util.Scanner;

public class MinAndMax {
    public static void main(String[] args) {
        minAndMaxInputChallenge();
    }

    private static void minAndMaxInputChallenge() {
        Scanner scanner = new Scanner(System.in);

        int minNumber = Integer.MAX_VALUE;
        int maxNumber = Integer.MIN_VALUE;
        int userInput;

        while(true) {
            System.out.print("Enter number: ");

            if(scanner.hasNextInt() == false) {
                break;
            }

            userInput = scanner.nextInt();

            if(userInp
            ut < minNumber)
                minNumber = userInput;

            if(userInput > maxNumber)
                maxNumber = userInput;
        }

        System.out.println("Min Number = " + minNumber + "\nMax Number = " + maxNumber);
        scanner.close();
    }
}
