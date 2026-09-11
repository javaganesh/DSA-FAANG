package com.dp;

public class ObServerDesignPattern {
    public static void main(String[] args) {
       YoutubeChannel youtubeChannel=new YoutubeChannel();
       ObServer ganesh=new SubScriber("Ganesh");
       ObServer rahul=new SubScriber("Rahul");
       ObServer harish=new SubScriber("Harish");
       youtubeChannel.subSrcibe(ganesh);
       youtubeChannel.subSrcibe(rahul);
       youtubeChannel.subSrcibe(harish);
       youtubeChannel.uploadvedios("Seiyar");
        System.out.println("===============================================");
       youtubeChannel.UnSubSrcibe(ganesh);
       youtubeChannel.uploadvedios("Kohana piyar hai");

    }
}
