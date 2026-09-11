package com.dsa.designpaatern.componet;

public class file implements FileSystemComponent{
    private String name;

    public file(String name) {
        this.name = name;
    }

    @Override
    public void showDetails() {
        System.out.println("File:"+name);
    }
}
