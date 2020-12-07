package ru.ssau.tk._emptiness_._tasks.person;

public class FirstTaskForPerson {
    public static void main(String[] args) {
        Person firstPerson = new Person();
        Person secondPerson = new Person();

        firstPerson.setFirstName("Cirilla");
        firstPerson.setLastName("Fiona Elen Riannon");
        firstPerson.setPassportId(111111);

        secondPerson.setFirstName("Triss");
        secondPerson.setLastName("Merigold");
        secondPerson.setPassportId(222222);

        System.out.println(firstPerson.getLastName() + ' ' + firstPerson.getFirstName() + "; passport: " + firstPerson.getPassportId());
        System.out.println(secondPerson.getLastName() + ' ' + secondPerson.getFirstName() + "; passport: " + secondPerson.getPassportId());
    }
}
