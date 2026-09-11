package com.dsa.designpaatern.proxy;

public class ProxyDcument implements Dcoument{
    String role;
    private RealDocument realDocument;

    public ProxyDcument(String role) {
        this.role = role;

    }

    @Override
    public void display() {
        if(!role.equalsIgnoreCase("ADMIN")){
            System.out.println("You access is Denied");
            return;
        }
        if(realDocument==null){
            realDocument=new RealDocument();
        }
        realDocument.display();

    }
}
