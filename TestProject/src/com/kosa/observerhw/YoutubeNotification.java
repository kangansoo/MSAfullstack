package com.kosa.observerhw;

public class YoutubeNotification {
    public static void main(String[] args) {
        YoutubeChannel channel = new YoutubeChannel();

        Subscriber subscriber1 = new Subscriber("구독자");
        Subscriber subscriber2 = new Subscriber("팔독자");
        Subscriber subscriber3 = new Subscriber("칠독자");
        Subscriber subscriber4 = new Subscriber("육독자");

        channel.registerObserver(subscriber1);
        channel.registerObserver(subscriber2);
        channel.registerObserver(subscriber3);
        channel.registerObserver(subscriber4);

        channel.uploadVideo("자바 프로그래밍 기초 강의");
        
        channel.removeObserver(subscriber4);
        channel.removeObserver(subscriber3);

        Subscriber subscriber5 = new Subscriber("오독자");
        Subscriber subscriber6 = new Subscriber("사독자");

        channel.registerObserver(subscriber5);
        channel.registerObserver(subscriber6);
        
        channel.uploadVideo("파이썬 프로그래밍 기초 강의");
        
    }
}
