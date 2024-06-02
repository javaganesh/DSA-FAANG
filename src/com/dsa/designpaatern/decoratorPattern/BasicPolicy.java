package com.dsa.designpaatern.decoratorPattern;

public class BasicPolicy implements  BasicPlan{
    @Override
    public int getPremium() {
        return 1560;
    }

    @Override
    public String getPoliceDetails() {
        return "Basic police insurance plan";
    }

}
