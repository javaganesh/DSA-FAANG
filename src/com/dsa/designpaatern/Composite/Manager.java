package com.dsa.designpaatern.Composite;

import java.util.ArrayList;
import java.util.List;

public class Manager  implements  Employee{
    private String name;
    List<Employee> employeeList;
    public Manager(String name) {
        this.name = name;
        this.employeeList=new ArrayList<>();
    }
    public void add(Employee employee) {
        employeeList.add(employee);
    }
    @Override
    public void showDetails() {
        System.out.println("Manager: " + name);
        for(Employee employee:employeeList){
            employee.showDetails();
        }

    }
}
