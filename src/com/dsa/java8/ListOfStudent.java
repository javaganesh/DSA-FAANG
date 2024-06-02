package com.dsa.java8;

import java.util.ArrayList;
import java.util.List;

public class ListOfStudent {
    public  static List<Student> getListOfListofStudent(){
        List<Student> list=new ArrayList<>();
        list.add(new Student(101,"Ganesh",23));
        list.add(new Student(102,"Raghunath",25));
        list.add(new Student(103,"Jemsh",30));
        list.add(new Student(104,"Ramesh",40));
        list.add(new Student(105,"Naresh",45));
        list.add(new Student(105,"Suresh",45));
        return list;
    }
}
