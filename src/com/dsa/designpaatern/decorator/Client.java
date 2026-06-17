package com.dsa.designpaatern.decorator;

public class Client {
    public static void main(String[] args) {
        Coffee coffee =  new SuggarCofee(new MilCoffee(new SimpleCoffee()));
        System.out.println(coffee.getCost());
        System.out.println(coffee.getDescription());
    }

}
