package com.lesson7;

import com.github.javafaker.IdNumber;
import com.github.javafaker.Name;

public class User {
    public User(String name, String id, String gender, Boolean isSubscriptionActive) {
        this.name = name;
        this.id = id;
        this.gender = gender;
        this.isSubscriptionActive = isSubscriptionActive;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public String getGender() {
        return gender;
    }

    public Boolean getSubscriptionActive() {
        return isSubscriptionActive;
    }

    String name;
    String id;
    String gender;
    Boolean isSubscriptionActive;

}
