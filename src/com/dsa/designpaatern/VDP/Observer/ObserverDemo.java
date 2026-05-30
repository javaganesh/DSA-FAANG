package com.dsa.designpaatern.VDP.Observer;

public class ObserverDemo {
    public static void main(String[] args) {
        YouTubeChannel youTubeChannel=new YouTubeChannel();

        Subscriber user1 = new User1();
        Subscriber user2 = new User2();
        youTubeChannel.subscribe(user1);
        youTubeChannel.subscribe(user2);
        youTubeChannel.uploadVideo(
                "Java Design Patterns Tutorial"
        );
    }
}
