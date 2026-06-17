package com.dsa.designpaatern.FactoryitSolid;

public class UpiPayement implements  Payment{
    @Override
    public void pay() {
        System.out.println("Upi payemnt");;
    }
}
