package by.tms.project.work1;

public class Phone implements PhoneCabell {

    private Person person;

    public Phone(Person person){
        this.person = person;
    }

    @Override
    public void connectedWithPhoneCabell() {
        this.person.dialingANumber();
    }
}
