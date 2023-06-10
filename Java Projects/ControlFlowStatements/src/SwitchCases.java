public class SwitchCases {

    public static void main(String[] args) {
        char charValue = 'R';

        switch (charValue) {
            case 'A':
                System.out.println("A was found");
                break;
            case 'B':
                System.out.println("B was found");
                break;
            case 'C': case 'D': case 'E':
                System.out.println(charValue + " was found");
                break;
            default:
                System.out.println("Could not find A, B, C, D or E");
        }

        String month = "MaRcH";

        switch (month.toLowerCase()) {
            case "january":
                System.out.println("Jan");
                break;
            case "june":
                System.out.println("Jun");
                break;
            default:
                System.out.println("Not sure");
        }

    }


}
