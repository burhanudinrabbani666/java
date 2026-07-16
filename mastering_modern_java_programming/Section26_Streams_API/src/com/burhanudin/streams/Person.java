package com.burhanudin.streams;

import java.util.List;

public class Person {
    private String name;
    private List<Integer> phoneNumber;

    public Person(String name, List<Integer> phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public List<Integer> getPhoneNumber() {
        return phoneNumber;
    }

}
