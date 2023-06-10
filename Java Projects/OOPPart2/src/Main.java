import com.rpoladia.composition.*;
import com.rpoladia.encapsulation.Printer;

public class Main {
    public static void main(String[] args) {
        //composition();
        //encapsulation();
        polymorphism();
    }

    public static void composition() {
        Wall wall1 = new Wall("East");
        Wall wall2 = new Wall("West");
        Wall wall3 = new Wall("North");
        Wall wall4 = new Wall("South");

        Ceiling ceiling = new Ceiling(12, 55);
        Bed bed = new Bed("Modern", 4, 3, 2, 1);
        Lamp lamp = new Lamp("Classic", false, 75);
        Bedroom bedRoom = new Bedroom("Raj", wall1, wall2, wall3, wall4,ceiling,bed,lamp);

        bedRoom.makeBed();
        bedRoom.getLamp().turnOn();
    }

    public static void encapsulation() {
        Printer printer = new Printer(50, true);
        System.out.println("initial page count = " + printer.getPagesPrinted());
        int pagesPrinted = printer.printPages(4);
        System.out.println("Pages printed was " + pagesPrinted + " new total print count for printer = " + printer.getPagesPrinted());
        pagesPrinted = printer.printPages(2);
        System.out.println("Pages printed was " + pagesPrinted + " new total print count for printer = " + printer.getPagesPrinted());
    }

    public static void polymorphism() {

    }
}