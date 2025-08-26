package com.observer;

public class SubscriberImpl implements Subscriber {
    String name;
    public void update(String content) {
        System.out.println(name+" "+content);
    }
    public SubscriberImpl(String name) {
        this.name = name;
    }

}
