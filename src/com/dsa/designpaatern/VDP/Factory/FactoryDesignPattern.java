package com.dsa.designpaatern.VDP.Factory;

import com.dsa.generic.Box;

interface Veichle{
    public  Long price();
}
class Car implements  Veichle{

    @Override
    public Long price() {
        System.out.println("Car purchesd");
        System.out.println("===========");
        return 3l;
    }
}
  class Bike implements Veichle{

      @Override
      public Long price() {
          System.out.println("Bike purchesd");
          return 2L;
      }
  }
  class VeichecleFactory{

    public static Veichle getVeichele(String type){
        if(type.equalsIgnoreCase("Car")){
            return new Car();
        }
        else if(type.equalsIgnoreCase("Bike")){
            return new Bike();
        }
        else {
            throw  new RuntimeException("Not Suppored");
        }
    }

  }

public class FactoryDesignPattern {
    public static void main(String[] args) {
      Veichle veichle  =VeichecleFactory.getVeichele("Car");
      Car car= (Car) veichle;
        System.out.println(car.price());

        Veichle veichle2  =VeichecleFactory.getVeichele("Bike");
        Bike bike= (Bike) veichle2;
        System.out.println(bike.price());

    }
}
