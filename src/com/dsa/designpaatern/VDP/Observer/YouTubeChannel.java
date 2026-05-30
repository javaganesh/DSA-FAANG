package com.dsa.designpaatern.VDP.Observer;

import java.util.ArrayList;
import java.util.List;

public class YouTubeChannel {
    private List<Subscriber> subscribers =
            new ArrayList<>();

    public void subscribe(Subscriber subscriber) {

        subscribers.add(subscriber);
    }
    public void unSubscribe(Subscriber subscriber){
        subscribers.remove(subscriber);
    }


    public void uploadVideo(String title) {

        System.out.println(
                "New Video Uploaded: " + title
        );

        notifySubscribers(title);
    }
    private void notifySubscribers(String title) {

        for(Subscriber subscriber : subscribers) {

            subscriber.update(title);
        }
    }
}
