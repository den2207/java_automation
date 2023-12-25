package com.lesson7;

public class Subscription implements Comparable<Subscription> {
    private String subscriptionName;
    private String subscriptionType;
    private Integer subscriptionDuration;

    public Subscription(String subscriptionName, String subscriptionType, Integer subscriptionDuration) {
        this.subscriptionName = subscriptionName;
        this.subscriptionType = subscriptionType;
        this.subscriptionDuration = subscriptionDuration;
    }

    public String getSubscriptionName() {
        return subscriptionName;
    }

    public String getSubscriptionType() {
        return subscriptionType;
    }

    public Integer getSubscriptionDuration() {
        return subscriptionDuration;
    }

    @Override
    public int compareTo(Subscription otherSubscription) {
        return this.subscriptionName.compareTo(otherSubscription.subscriptionName);
    }
}

