package com.dsa.designpaatern.obserb;

import java.util.ArrayList;
import java.util.List;

public class Chanelpublisher {
      String title;

    /*public Chanelpublisher(String title) {
        this.title = title;
    }*/

    List<SubScribder> list=new ArrayList<>();


    public void subscribe(SubScribder sub){
        list.add(sub);
    }

    public void Unsubscribe(SubScribder sub){
        list.remove(sub);
    }

    public void notfiysubscriber(){
        list.forEach(s->{
            s.update(this);
        });
    }

    public void upload(String title){
        this.title=title;
        notfiysubscriber();


    }
}
