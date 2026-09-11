package com.dp.observerPattern;

public class RewardPointService implements Observer {

    @Override
    public void update(Order order) {

        System.out.println(
                "Reward points added.");

    }

}
