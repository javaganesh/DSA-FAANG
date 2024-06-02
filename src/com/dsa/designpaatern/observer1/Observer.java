package com.dsa.designpaatern.observer1;

public interface Observer {
    public void update();
    public void update(String messge);
    public void setSubject(Subject subject);

}
