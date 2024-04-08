package com.kosa.observerhw;

import java.util.ArrayList;
import java.util.List;

class YoutubeChannel implements Subject {
    private List<Observer> subscribers;
    private String latestVideo;

    public YoutubeChannel() {
        subscribers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer observer) {
        subscribers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        subscribers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : subscribers) {
            observer.update(latestVideo);
        }
    }

    public void uploadVideo(String videoTitle) {
        latestVideo = videoTitle;
        notifyObservers();
    }
}
