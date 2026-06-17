package com.dsa.designpaatern.Composite;

public class Client {
    public static void main(String[] args) {
        Employee dev1 =
                new Developer("Ganesh");

        Employee dev2 =
                new Developer("Rahul");

        Manager manager =
                new Manager("Amit");

        manager.add(dev1);
        manager.add(dev2);

        manager.showDetails();

    }
}
