package com.rpoladia.jpm.section6;

public class CE033_CarpetCostCalculator {
    public static void main(String[] args) {
        Carpet carpet = new Carpet(3.5);
        Floor floor = new Floor(2.75, 4.0);
        Calculator calculator = new Calculator(floor, carpet);
        System.out.println("total= " + calculator.getTotalCost());
        carpet = new Carpet(1.5);
        floor = new Floor(5.4, 4.5);
        calculator = new Calculator(floor, carpet);
        System.out.println("total= " + calculator.getTotalCost());
    }
}

class Floor {
    private double width = 0;
    private double length = 0;

    public Floor(double width, double length) {
        if(width > 0)
            this.width = width;

        if(length > 0)
            this.length = length;
    }

    public double getArea() {
        return width*length;
    }
}

class Carpet {
    private double cost = 0;

    public double getCost() {
        return cost;
    }

    public Carpet(double cost) {
        if(cost > 0)
            this.cost = cost;
    }
}

class Calculator {
    private Floor floor;
    private Carpet carpet;

    public Calculator(Floor floor, Carpet carpet) {
        this.floor = floor;
        this.carpet = carpet;
    }

    public double getTotalCost() {
        return carpet.getCost()*floor.getArea();
    }
}