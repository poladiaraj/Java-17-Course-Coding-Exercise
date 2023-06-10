public class Main {

    private static final String INVALID_VALUE_MESSAGE = "Invalid Value";

    public static void main(String[] args) {
        String result = getDurationString(60, 59);
        System.out.println(result);
        result = getDurationString(130, 45);
        System.out.println(result);
        result = getDurationString(20, 15);
        System.out.println(result);
        result = getDurationString(-1, 15);
        System.out.println(result);
        result = getDurationString(20, 60);
        System.out.println(result);
    }

    private static String getDurationString(int minutes, int seconds) {

        if (minutes >= 0 && (seconds >= 0 && seconds <= 59)) {
            int hours = minutes / 60;
            minutes %= 60;

            String result = hours + "h " + minutes + "m " + seconds + "s";

            return result;
        }

        return INVALID_VALUE_MESSAGE;
    }
}