package com.dsa.designpaatern.chainOfResp;

public class AuthenticationHandler extends Handler {

    @Override
    protected void process(LoginRequest request) {

        System.out.println("Username Verified");

    }

}
