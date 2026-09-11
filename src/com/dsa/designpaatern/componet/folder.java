package com.dsa.designpaatern.componet;

import java.util.ArrayList;
import java.util.List;

public class folder implements FileSystemComponent {
    private String name;
    private List<FileSystemComponent> fileSystemComponentList=new ArrayList<>();

    public folder(String name) {

        this.name = name;

    }
    public  void add(FileSystemComponent fileSystemComponent){
        fileSystemComponentList.add(fileSystemComponent);
    }
    public void remove(FileSystemComponent fileSystemComponent){
        fileSystemComponentList.remove(fileSystemComponent);
    }
    @Override
    public void showDetails() {
        System.out.println("Folder : " + name);
        for(FileSystemComponent fileSystemComponent:fileSystemComponentList){
            fileSystemComponent.showDetails();
        }
    }
}
