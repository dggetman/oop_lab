package ru.ssau.tk._emptiness_._tasks.person;

public class SecondTaskForPerson {
    public static void main(String[] args) {
        Person firstObj = new Person();
        Person secondObj = new Person("Julian Alfred Pankratz,", " wicehrabia de Lettenhove");
        Person thirdObj = new Person(111111);
        Person fourthObj = new Person("Julian Alfred Pankratz,", " wicehrabia de Lettenhove", 111111);
        System.out.println("The first line: " + firstObj.getFirstName() + ' ' + firstObj.getLastName() + ", passport " + firstObj.getPassportId());
        System.out.println("The second line: " + secondObj.getFirstName() + ' ' + secondObj.getLastName() + ", passport " + secondObj.getPassportId());
        System.out.println("The third line: " + thirdObj.getFirstName() + ' ' + thirdObj.getLastName() + ", passport " + thirdObj.getPassportId());
        System.out.println("The fourth line: " + fourthObj.getFirstName() + ' ' + fourthObj.getLastName() + ", passport " + fourthObj.getPassportId());
    }
}
