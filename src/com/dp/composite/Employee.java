package com.dp.composite;

public class Employee implements  IEmployee{
    private String role;

    public Employee(String role){
        this.role=role;
    }
    @Override
    public int getSalary() {
        if(role.equals("tester")){
            return 10000;
        } else if (role.equals("developer")) {
            return 15000;
        }
        else return 20000;

    }
}
