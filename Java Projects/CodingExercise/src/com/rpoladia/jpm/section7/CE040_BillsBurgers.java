package com.rpoladia.jpm.section7;

public class CE040_BillsBurgers {
    public static void main(String[] args) {
        Hamburger hamburger = new Hamburger("Basic", "Sausage", 3.56, "White");
        hamburger.addHamburgerAddition1("Tomato", 0.27);
        hamburger.addHamburgerAddition2("Lettuce", 0.75);
        hamburger.addHamburgerAddition3("Cheese", 1.13);
        System.out.println("Total Burger price is " + hamburger.itemizeHamburger());

        HealthyBurger healthyBurger = new HealthyBurger("Bacon", 5.67);
        healthyBurger.addHamburgerAddition1("Egg", 5.43);
        healthyBurger.addHealthyAddition1("Lentils", 3.41);
        System.out.println("Total Healthy Burger price is  " + healthyBurger.itemizeHamburger());

        DeluxeBurger db = new DeluxeBurger();
        db.addHamburgerAddition3("Should not do this", 50.53);
        System.out.println("Total Deluxe Burger price is " + db.itemizeHamburger());
    }
}

class Hamburger {
    private String name;
    private String meat;
    private double price;
    private String breadRollType;

    private String addition1Name;
    private double addition1Price;

    private String addition2Name;
    private double addition2Price;

    private String addition3Name;
    private double addition3Price;

    private String addition4Name;
    private double addition4Price;

    public Hamburger(String name, String meat, double price, String breadRollType) {
        this.name = name;
        this.meat = meat;
        this.price = price;
        this.breadRollType = breadRollType;
    }

    public void addHamburgerAddition1(String name, double price) {
        this.addition1Name = name;
        this.addition1Price = price;
    }

    public void addHamburgerAddition2(String name, double price) {
        this.addition2Name = name;
        this.addition2Price = price;
    }

    public void addHamburgerAddition3(String name, double price) {
        this.addition3Name = name;
        this.addition3Price = price;
    }

    public void addHamburgerAddition4(String name, double price) {
        this.addition4Name = name;
        this.addition4Price = price;
    }

    public double itemizeHamburger() {
        System.out.println(name + " hamburger on a " + breadRollType + " roll with " + meat + ", price is " + price);

        if(addition1Price > 0) {
            System.out.println("Added " + addition1Name + " for an extra " + addition1Price);
            price += addition1Price;
        }

        if(addition2Price > 0) {
            System.out.println("Added " + addition2Name + " for an extra " + addition2Price);
            price += addition2Price;
        }

        if(addition3Price > 0) {
            System.out.println("Added " + addition3Name + " for an extra " + addition3Price);
            price += addition3Price;
        }

        if(addition4Price > 0) {
            System.out.println("Added " + addition4Name + " for an extra " + addition3Price);
            price += addition3Price;
        }
        return price;
    }
}

class DeluxeBurger extends Hamburger {
    public DeluxeBurger() {
        super("Deluxe", "Sausage & Bacon", 14.54, "White");
        super.addHamburgerAddition1("Chips", 2.75);
        super.addHamburgerAddition2("Drink", 1.81);
    }

    @Override
    public void addHamburgerAddition3(String name, double price) {
    }

    @Override
    public void addHamburgerAddition4(String name, double price) {
    }
}

class HealthyBurger extends Hamburger{
    private String healthyExtra1Name;
    private double healthyExtra1Price;

    private String healthyExtra2Name;
    private double healthyExtra2Price;

    public HealthyBurger(String meat, double price) {
        super("Healthy", meat, price, "Brown rye");
    }

    public void addHealthyAddition1(String name, double price) {
        this.healthyExtra1Name = name;
        this.healthyExtra1Price = price;
    }

    public void addHealthyAddition2(String name, double price) {
        this.healthyExtra2Name = name;
        this.healthyExtra2Price = price;
    }

    @Override
    public double itemizeHamburger() {
        double total = super.itemizeHamburger();

        if(healthyExtra1Price > 0) {
            System.out.println("Added " + healthyExtra1Name + " for an extra " + healthyExtra1Price);
            total += healthyExtra1Price;
        }

        if(healthyExtra2Price > 0) {
            System.out.println("Added " + healthyExtra2Name + " for an extra " + healthyExtra2Price);
            total += healthyExtra2Price;
        }

        return total;
    }
}