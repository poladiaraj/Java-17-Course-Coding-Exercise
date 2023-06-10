public class Challenge {
    /**
     * Challenge to convert Pound to KG
     * @param args
     */
    public static void main(String[] args) {
        double weightInPounds = 200d;
        double conversionRatePtoK = 0.45359237d;
        double weightInKG =weightInPounds*conversionRatePtoK;

        System.out.println(weightInPounds + " Pounds = " + weightInKG + " KGs");
    }
}
