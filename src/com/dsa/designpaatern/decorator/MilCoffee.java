package com.dsa.designpaatern.decorator;

public class MilCoffee  extends  CofeeDecorator{
    public MilCoffee(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription() {
        return "Milk cofee"+super.getDescription();
    }

    @Override
    public double getCost() {
        return 10.0+super.getCost();
    }
}
