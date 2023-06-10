package com.rpoladia.master;

public class Main {
    public static void main(String[] args) {
        //testHamburger();
        //testHealthyBurger();
        testDeluxeBurger();
    }

    private static void testHamburger() {
        Hamburger hamburger = new Hamburger("Basic", "Sausage",3.56,"White");
        double price = hamburger.itemizeHamburger();
        hamburger.addHamburgerAddition1("Tomato", 0.27);
        hamburger.addHamburgerAddition2("Lettuse", 0.75);
        hamburger.addHamburgerAddition3("Cheese", 1.12);
        System.out.println("Total Burger price is " + hamburger.itemizeHamburger());
    }

    private static void testHealthyBurger() {
        HealthyBurger healthyBurger = new HealthyBurger("Bacon", 5.67);
        healthyBurger.addHealthyAddition1("Egg", 5.43);
        healthyBurger.addHealthyAddition2("Lentils", 3.41);
        healthyBurger.itemizeHamburger();
        System.out.println("Total Healthy Burger price is " + healthyBurger.itemizeHamburger());
    }

    private static void testDeluxeBurger() {
        DeluxeBurger deluxeBurger = new DeluxeBurger();
        deluxeBurger.itemizeHamburger();
        deluxeBurger.addHamburgerAddition1("Something", 1.0);
        deluxeBurger.itemizeHamburger();
    }
}
