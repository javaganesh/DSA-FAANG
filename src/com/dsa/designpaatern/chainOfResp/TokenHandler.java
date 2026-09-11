package com.dsa.designpaatern.chainOfResp;

public class TokenHandler extends Handler {

    @Override
    protected void process(LoginRequest request) {

        System.out.println("JWT Generated");

    }

}