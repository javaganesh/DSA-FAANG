package com.dsa.java8;


public class Person {
    private String firstName;
    private String lasttName;
    private  int age;
    private Employee employee;


    public Person(String firstName, String lasttName, int age, Employee employee) {
        this.firstName = firstName;
        this.lasttName = lasttName;
        this.age = age;
        this.employee = employee;
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLasttName() {
        return lasttName;
    }

    public void setLasttName(String lasttName) {
        this.lasttName = lasttName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lasttName='" + lasttName + '\'' +
                ", age=" + age +
                ", employee=" + employee +
                '}';
    }
}
