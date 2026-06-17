package com.dsa.designpaatern.decorator;

public class SuggarCofee extends  CofeeDecorator{
    public SuggarCofee(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription() {
        return "Suggat Coffe"+super.getDescription();
    }

    @Override
    public double getCost() {
        return 7.0+super.getCost();
    }
}
