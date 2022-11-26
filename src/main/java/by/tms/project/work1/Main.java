package by.tms.project.work1;

import by.tms.project.work1.Person;
import by.tms.project.work1.Phone;
import by.tms.project.work1.PhoneCabell;

public class Main {

    public static void main(String[] args) {
        PhoneCabell phone = new Phone(new Person());
        phone.connectedWithPhoneCabell();
    }
}
