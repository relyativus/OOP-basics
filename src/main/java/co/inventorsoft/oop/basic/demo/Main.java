package co.inventorsoft.oop.basic.demo;

import co.inventorsoft.oop.basic.model.Person;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class Main {

    public static void main(String[] args) {
        final Person martynBorodavka = new Person("Martyn", "Borodavka",
                LocalDateTime.of(LocalDate.of(1736, Month.JULY, 10), LocalTime.now()));

        //Oh. A lot of questions here. What's about DocumentDetails

    }

}
