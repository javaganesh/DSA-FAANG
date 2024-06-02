package com.dsa.designpaatern.observer1;

import java.util.ArrayList;
import java.util.List;

public class SubjectImpl implements Subject{
    List<Observer> list;
    private String message;
    public SubjectImpl(){
        this.list=new ArrayList<>();
    }
    @Override
    public void register(Observer observer) {
        if(observer==null){
            throw  new NullPointerException("Object is null");
        }
        list.add(observer);

    }

    @Override
    public void unRegister(Observer observer) {
        if(observer==null){
            throw  new NullPointerException("Object is null");
        }
        list.remove(observer);
    }

    @Override
    public void notifyobserver() {
        if(!list.isEmpty() || list==null) {
            for (Observer ob : list) {
                ob.update(message);
            }
        }
        else{
            System.out.println("No observer");
        }

    }

    @Override
    public Object getObject() {
        return message;
    }

    @Override
    public void postmessage(String mess) {

        System.out.println("Message for posted for subject :"+message);
        this.message=mess;
        notifyobserver();

    }

}
