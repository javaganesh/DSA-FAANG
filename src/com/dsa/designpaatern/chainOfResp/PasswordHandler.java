package com.dsa.designpaatern.chainOfResp;

public class PasswordHandler extends Handler {

    @Override
    protected void process(LoginRequest request) {

        System.out.println("Password Verified");

    }

}