package com.dsa.designpaatern.decoratorPattern;

public class DecoratorPattern {

    public static void main(String[] args) {
        BasicPlan ganeshPlan=new BasicPolicy();
        System.out.println(ganeshPlan.getPremium());
        System.out.println(ganeshPlan.getPoliceDetails());
        System.out.println("================================================================");
        BasicPlan nikuPlan=new BasicPolicy();
        System.out.println(nikuPlan.getPremium());
        System.out.println(nikuPlan.getPoliceDetails());
        nikuPlan=new MedicalPlan(nikuPlan);
        System.out.println(nikuPlan.getPremium()    );
        System.out.println(nikuPlan.getPoliceDetails());


        nikuPlan=new CriticalIllencePolice(nikuPlan);
        System.out.println(nikuPlan.getPremium()    );
        System.out.println(nikuPlan.getPoliceDetails());






    }

}
