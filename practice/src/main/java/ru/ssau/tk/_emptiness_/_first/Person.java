package ru.ssau.tk._emptiness_._first;

public class Person {
    private String firstName, lastName;
    private int passportId;

    public Person() {
    }

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Person(int passportId) {
        this.passportId = passportId;
    }
}
