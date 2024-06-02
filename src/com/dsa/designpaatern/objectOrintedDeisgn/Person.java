package com.dsa.designpaatern.objectOrintedDeisgn;

import java.time.LocalDate;

public class Person {
    private String firstName;
    private String lastName;

    private Person spouse;
    private Pet pet;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
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

    public Person getSpouse() {
        return spouse;
    }

    public void setSpouse(Person spouse) {
        this.spouse = spouse;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }


    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", spouse=" + spouse +
                ", pet=" + pet +
                '}';
    }

    public static void main(String[] args) {

        Person person=new Person("Ganesh","parida");
        Person wife=new Person("Puja","Senapati");
        person.setSpouse(wife);
        Pet pet=new Dog("DJ", LocalDate.now());
        person.setPet(pet);
        System.out.println(person);


    }
}
