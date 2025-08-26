package com.observer;

import java.util.ArrayList;
import java.util.List;

public class ChannelImpl implements Channel {
    String content;
    List<Subscriber> subscribers = new ArrayList<Subscriber>();

    public void add(Subscriber s) {
        subscribers.add(s);
    }
    public void remove(Subscriber s) {
        subscribers.remove(s);
    }
    public void notifyAlll() {
        for(Subscriber s : subscribers) {
            s.update(content);
        }
    }

    public void setContent(String content) {
        this.content = content;
        notifyAlll();
    }
}
