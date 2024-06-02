package com.dsa.designpaatern.objectOrintedDeisgn;

import java.time.LocalDate;

public class Dog extends Pet{
    public Dog(String name, LocalDate dob) {
        super(name, dob);
    }

    public  void sound(){
        System.out.println("bhaha");
    }
}
