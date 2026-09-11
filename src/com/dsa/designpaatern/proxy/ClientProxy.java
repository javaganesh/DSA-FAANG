package com.dsa.designpaatern.proxy;

public class ClientProxy {
    public static void main(String[] args) {
        ProxyDcument proxyDcument=new ProxyDcument("ADMIN");
        proxyDcument.display();
    }
}
