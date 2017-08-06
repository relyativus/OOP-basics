package co.inventorsoft.oop.basic.demo;

import co.inventorsoft.oop.basic.model.Passport;
import co.inventorsoft.oop.basic.model.Person;

public class Main {

    public static void main(String[] args) {
        final Person person = new Person(); //first problem solved: we cannot create class without specifying required

        final Person martynBorodavka = new Person("Martyn", "Borodavka", 218); //much better but again we can broke everything with setters

        person.setAge(-2); //we can initialize it with invalid values
        person.setPassport(new Passport()); //we can create objects we are not responsible to create
    }
}
