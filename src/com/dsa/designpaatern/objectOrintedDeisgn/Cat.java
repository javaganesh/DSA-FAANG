package com.dsa.designpaatern.objectOrintedDeisgn;

import java.time.LocalDate;

public class Cat extends Pet{
    public Cat(String name, LocalDate dob) {
        super(name, dob);
    }

    public void sound(){
        System.out.println("meow meow");
    }
}
