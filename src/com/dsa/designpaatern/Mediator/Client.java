package com.dsa.designpaatern.Mediator;

public class Client {
    public static void main(String[] args) {
        ChatMediator room = new ChatRoom();

        User ganesh =
                new ChatUser(room, "Ganesh");

        User rahul =
                new ChatUser(room, "Rahul");

        User ankit =
                new ChatUser(room, "Ankit");


        room.addUser(ganesh);
        room.addUser(rahul);
        room.addUser(ankit);
        ganesh.send("Hello Everyone");
    }
}
