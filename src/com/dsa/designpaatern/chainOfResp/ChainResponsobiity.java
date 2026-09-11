package com.dsa.designpaatern.chainOfResp;

public class ChainResponsobiity {
    public static void main(String[] args) {
        Handler auth = new AuthenticationHandler();
        Handler password = new PasswordHandler();
        Handler token = new TokenHandler();

        auth.setNextHandler(password).setNextHandler(token);
        LoginRequest request =
                new LoginRequest("ganesh", "1234");
        auth.handle(request);
    }
}
