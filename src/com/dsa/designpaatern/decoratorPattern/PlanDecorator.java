package com.dsa.designpaatern.decoratorPattern;

public abstract class  PlanDecorator implements BasicPlan {
    BasicPlan basicPlan;
    public PlanDecorator(BasicPlan plan){
        this.basicPlan=plan;
    }

    @Override
    public int getPremium() {
        return basicPlan.getPremium();
    }

    @Override
    public String getPoliceDetails() {
        return basicPlan.getPoliceDetails();    
    }
}
