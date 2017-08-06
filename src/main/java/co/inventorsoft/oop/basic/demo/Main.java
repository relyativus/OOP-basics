package co.inventorsoft.oop.basic.demo;

import co.inventorsoft.oop.basic.model.Passport;
import co.inventorsoft.oop.basic.model.Person;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class Main {

    public static void main(String[] args) {
        final Person martynBorodavka = new Person("Martyn", "Borodavka",
                LocalDateTime.of(LocalDate.of(1736, Month.JULY, 10), LocalTime.now()));
        /*
         * age calculation is reflective to current date but we don't care because of encapsulation
         */
        printAge(martynBorodavka);

        martynBorodavka.setAge(-2); //we cannot change created person's age which is makes sense
        martynBorodavka.setPassport(new Passport()); //we cannot create passport object without required info

        /*
        * we can omit birth date for newborns but age is calculation right. But again we don't care. thanks for encapsulation
        */
        final Person newBorn = new Person("Ivan", "Ivanenko");
        printAge(newBorn);
    }

    private static String printAge(final Person person) {
        System.out.println(String.format("Martyn Borodavka is %d years old", person.getAge()));
    }
}
