package co.inventorsoft.oop.basic.demo;

import co.inventorsoft.oop.basic.model.Passport;
import co.inventorsoft.oop.basic.model.Person;

public class Main {

    public static void main(String[] args) {
        final Person person = new Person(); //first problem: we can use this class before we have fully initialize it

        person.setAge(-2); //we can initialize it with invalid values
        person.setPassport(new Passport()); //we can create objects we are not responsible to create
    }
}
