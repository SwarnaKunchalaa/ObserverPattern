package com.observer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public interface Channel {
    public void add(Subscriber subscriber);
    public void remove(Subscriber subscriber);
    public void notifyAlll();
    public void setContent(String Content);
}
