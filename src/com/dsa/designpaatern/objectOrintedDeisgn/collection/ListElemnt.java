package com.dsa.designpaatern.objectOrintedDeisgn.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

class  Employee{
    private int id;
    private String firstName;
    private  String lastName;

    public Employee(int id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public static List<Employee> getEmployee(){
        List<Employee> list=new ArrayList<>();

           list.add(new Employee(101,"Ganesh","Parida"));
           list.add(new Employee(102,"Rakesh","Parida"));
           list.add(new Employee(103,"Samerr","Parida"));
           list.add(new Employee(104,"Silu","Parida"));
           list.add(new Employee(105,"Dharmesh","Parida"));

        return list;

    }
}

public class ListElemnt {
    public static void main(String[] args) {
        List<Integer> li=new ArrayList<>();
        li.add(10);
        li.add(20);
        li.add(30);
        li.add(40);
        li.add(50);
        System.out.println(li);
      //  ListIterator<Integer>  list = li.listIterator();
        Iterator<Integer>  itr = li.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
        List<Employee> list= Employee.getEmployee();
        list.forEach(l->{
            System.out.println(l.getId()+ "  "+l.getFirstName()+ "  "+l.getLastName());
        });


    }
}
