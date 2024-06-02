package com.dsa.java8;

import java.util.*;

public class Compartaot {
    public static void main(String[] args) {
        Person person1=new Person("Ganesh","parida",20,new Employee(101,1000l,"Admin"));
        Person person2=new Person("Suresh","Sahu",20,
                new Employee(102,4000l,"Devops"));
        Person person3=new Person("Ram","patra",20,
                new Employee(103,2000l,"S/w"));
        Person person4=new Person("Naesh","parida",20,
                new Employee(104,3000l,"Tester"));


        Comparator<Person> comparator=new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getFirstName().compareTo(o2.getFirstName());
            }
        };
        Comparator<Person> nameComparator=( o1,o2)->{
            return o1.getFirstName().compareTo(o2.getFirstName());
        };

        Comparator<Person> firstNameComparator= Comparator.comparing(e->e.getFirstName());
        Comparator<Person> lastNameComparator= Comparator.comparing(e->e.getLasttName());
        Comparator<Person> salComparator= Comparator.comparingLong(e->e.getEmployee().getSal());
        Comparator<Person> firstAndLastNameAndSal = firstNameComparator.thenComparing(lastNameComparator).thenComparing(salComparator);
        Comparator<Person> empsalComparator= Comparator.comparing(e->e.getEmployee(),(o1,o2)->{
            return o1.getSal().compareTo(o2.getSal());
        });

        List<Person> list=Arrays.asList(person1,person2,person3,person4);
        System.out.println("befor"+list);
        //Collections.sort(list,comparator);
        Collections.sort(list,nameComparator);
        System.out.println("after"+list);
        Collections.sort(list,firstAndLastNameAndSal);
        System.out.println("firstname And LastName And Sala"+list);

    }
}
