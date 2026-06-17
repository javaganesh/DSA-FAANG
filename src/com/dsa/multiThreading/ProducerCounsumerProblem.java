package com.dsa.multiThreading;

class Food {
    boolean ready = false;
}
class Son extends  Thread{
    private Food food;

    public Son(Food food) {
        this.food = food;
    }

    @Override
    public void run() {
        synchronized (food){
            while (!food.ready){
                try {
                    System.out.println("Son: Waiting for food...");
                    food.wait();
                }
                catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Son: Eating food 🍔");
            }

        }
    }
}


public class ProducerCounsumerProblem {
    public static void main(String[] args) {

        Food food = new Food();

        Son son = new Son(food);
        Mother mother = new Mother(food);
        son.start();
        mother.start();
    }
}
