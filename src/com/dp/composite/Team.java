package com.dp.composite;

import java.util.ArrayList;
import java.util.List;

public class Team implements IEmployee{
    List<IEmployee> employeeList=new ArrayList<>();
    public void setEmployees(IEmployee employee){
        employeeList.add(employee);
    }
    @Override
    public int getSalary() {
       int total=0;
        for(IEmployee emp:employeeList){
            total+=emp.getSalary();
        }
        return total;
    }
}
