package com.dsa.designpaatern.observer1;

public interface Subject {
    public  void register(Observer observer);
    public  void unRegister(Observer observer);
    public  void notifyobserver();
    public  Object getObject();
    public void postmessage(String mess);


}
