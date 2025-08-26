package com.observer;

public class Main {
    public static void main(String[] args) {
       Channel channel = new ChannelImpl();

       Subscriber s1 = new SubscriberImpl("Doraemon");
        Subscriber s2 = new SubscriberImpl("Shinchan");
        Subscriber s3 = new SubscriberImpl("Heidi");

        channel.add(s1);
        channel.add(s3);
        channel.add(s2);

        channel.setContent("new Chota bheen episode uploaded!!!");

    }
}