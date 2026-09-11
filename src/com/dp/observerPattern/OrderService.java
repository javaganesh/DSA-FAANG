package com.dp.observerPattern;

import java.util.ArrayList;
import java.util.List;

public class OrderService implements Subject{
    private List<Observer> list=new ArrayList<>();
    private  Order order;

    @Override
    public void subscribe(Observer observer) {
        list.add(observer);
    }

    @Override
    public void unsubscribe(Observer observer) {
        list.remove(observer);

    }

    @Override
    public void notifyObservers() {
      for(Observer observer:list){
          observer.update(order);
      }
    }
    public void placeOrder(Order order) {

        this.order = order;

        System.out.println("Order Placed Successfully");

        notifyObservers();

    }

}
