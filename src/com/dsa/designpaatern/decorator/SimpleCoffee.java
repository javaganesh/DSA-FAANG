package com.dsa.designpaatern.decorator;

public class SimpleCoffee implements  Coffee{
    @Override
    public String getDescription() {
        return "Simple cofee";
    }

    @Override
    public double getCost() {
        return 5.0;
    }
}
