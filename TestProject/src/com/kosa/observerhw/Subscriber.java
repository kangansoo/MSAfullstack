package com.kosa.observerhw;

class Subscriber implements Observer {
    private String name;

    public Subscriber(String name) {
        this.name = name;
    }

    @Override
    public void update(String videoTitle) {
        System.out.println("[" + name + "] 새로운 영상이 업로드 되었습니다: " + videoTitle);
    }
}
