public class WhileLoop {
    public static void main(String[] args) {
        int number = 4;
        int finishNumber = 20;
        int evenNumbersFound = 0;
        int total = 0;
        while(number <= finishNumber) {
            number++;
            if(!isEvenNumber(number)) {
                continue;
            }

            System.out.println("Even number " + number);
            evenNumbersFound++;
            total+=number;

            if(evenNumbersFound == 5)
                break;
        }

        System.out.println("Total of 5 even numbers = " + total);
    }

    private static boolean isEvenNumber(int number) {
        if(number%2 == 0) {
            return true;
        }
        return false;
    }
}
