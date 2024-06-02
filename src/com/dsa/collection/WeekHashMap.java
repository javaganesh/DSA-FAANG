package com.dsa.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

class Person{
    private int id;
    private String name;
    private Double sal;

    public Person(int id, String name, Double sal) {
        this.id = id;
        this.name = name;
        this.sal = sal;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sal=" + sal +
                '}';
    }
}
public class WeekHashMap {
    public static void main(String[] args) {
        //Map<Person,String> personMap=new HashMap<>();
        Map<Person,String> personMap=new WeakHashMap<>();
        Person person1=new Person(101,"Ganesh",200.00);
        personMap.put(person1,"engineer");
        System.out.println(personMap);
      person1=null;
      System.gc();
        System.out.println(personMap);


    }
}
