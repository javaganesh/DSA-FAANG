package com.dsa.designpaatern.observer1;

public class ObserImpl implements Observer{
    public String obserName;
    Subject subjectRegister;
     ObserImpl(String obserName){
         this.obserName=obserName;
     }

    @Override
    public void update() {
        String message=(String) subjectRegister.getObject();
        if(message!=null){
            System.out.println(obserName+" ");
        }
        else {
            System.out.println("No message has recived");
        }


    }

    @Override
    public void update(String messge) {

    }

    @Override
    public void setSubject(Subject subject) {
         this.subjectRegister=subject;

    }
}
