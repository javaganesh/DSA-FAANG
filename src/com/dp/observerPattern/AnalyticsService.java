package com.dp.observerPattern;

public class AnalyticsService implements Observer {

    @Override
    public void update(Order order) {

        System.out.println(
                "Analytics updated.");

    }

}