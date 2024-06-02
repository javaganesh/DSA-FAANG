package com.dsa.designpaatern.objectOrintedDeisgn;

import java.time.LocalDate;

public class Pet {
    private String name;
    private LocalDate dob;

    public Pet(String name, LocalDate dob) {
        this.name = name;
        this.dob = dob;
    }

    @Override
    public String toString() {
        return "Pet{" +
                "name='" + name + '\'' +
                ", dob=" + dob +
                '}';
    }
}
