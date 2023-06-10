public class Main {
    public static void main(String[] args) {
        double centimeters = MethodOverloading.calcFeetAndInchesToCentimeters(5,10);
        centimeters = MethodOverloading.calcFeetAndInchesToCentimeters(-10,10);

        if(centimeters < 0.0)
        {
            System.out.println("Invalid parameters");
        }

        centimeters = MethodOverloading.calcFeetAndInchesToCentimeters(70);
    }
}