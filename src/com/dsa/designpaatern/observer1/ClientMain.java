package com.dsa.designpaatern.observer1;

import java.util.ArrayList;
import java.util.List;

public class ClientMain {
    public static void main(String[] args) {
        Subject subject=new SubjectImpl();
        List<Observer> listObseves=new ArrayList<>();
        for(int i=0;i<5;i++){
            listObseves.add(new ObserImpl("Observer-:"+i));
        }
        for(Observer observer :listObseves){
            subject.register(observer);
            observer.setSubject(subject);
        }
        listObseves.get(0).update();
        subject.postmessage("This is obsrber design apttern test");
    }
}
