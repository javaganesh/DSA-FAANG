package com.dsa.designpaatern.decorator;

public abstract class  CofeeDecorator  implements Coffee{
    private  Coffee decoratedCoffee;
    public CofeeDecorator(Coffee c) {
        this.decoratedCoffee = c; }
    public String getDescription() { return decoratedCoffee.getDescription(); }
    public double getCost() { return decoratedCoffee.getCost(); }
}
