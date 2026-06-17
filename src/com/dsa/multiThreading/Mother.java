package com.dsa.multiThreading;

public class Mother extends  Thread{
    private Food food;

    public Mother(Food food) {
        this.food = food;
    }

    @Override
    public void run() {
        synchronized (food) {
            System.out.println("Mother: Cooking food...");
            try {
                Thread.sleep(3000);
            } catch (Exception e) {
            }
            food.ready = true;
            System.out.println("Mother: Food is ready");

            food.notify();
        }
    }
}
