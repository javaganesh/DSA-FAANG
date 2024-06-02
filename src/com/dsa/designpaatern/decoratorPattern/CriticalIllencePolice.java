package com.dsa.designpaatern.decoratorPattern;

public class CriticalIllencePolice extends PlanDecorator{
    public CriticalIllencePolice(BasicPlan plan) {
        super(plan);
    }

    @Override
    public int getPremium() {
        return super.getPremium()+1000;
    }

    @Override
    public String getPoliceDetails() {
        return super.getPoliceDetails()+"adde extra CriticalIllencePolice";
    }
}
