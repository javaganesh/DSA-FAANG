package com.dsa.java8;

public class Employee {
    private  int id;
    private  Long sal;
    private  String desg;

    public Employee(int id, Long sal, String desg) {
        this.id = id;
        this.sal = sal;
        this.desg = desg;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Long getSal() {
        return sal;
    }

    public void setSal(Long sal) {
        this.sal = sal;
    }

    public String getDesg() {
        return desg;
    }

    public void setDesg(String desg) {
        this.desg = desg;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", sal=" + sal +
                ", desg='" + desg + '\'' +
                '}';
    }
}
