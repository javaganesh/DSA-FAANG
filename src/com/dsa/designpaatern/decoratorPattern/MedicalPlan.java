package com.dsa.designpaatern.decoratorPattern;

public class MedicalPlan extends  PlanDecorator{


    public MedicalPlan(BasicPlan plan) {
        super(plan);
    }


    @Override
    public int getPremium() {
        return super.getPremium()+ 60;
    }

    @Override
    public String getPoliceDetails() {
        return super.getPoliceDetails()+"medical added";
    }
}
