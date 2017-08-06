package co.inventorsoft.oop.basic.demo;

import co.inventorsoft.oop.basic.model.Person;
import co.inventorsoft.oop.basic.model.goverment.document.Passport;
import co.inventorsoft.oop.basic.model.goverment.document.PassportDepartment;

import java.awt.image.BufferedImage;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class Main {

    private static final PassportDepartment passportDepartment = new PassportDepartment();

    public static void main(String[] args) {
        final Person martynBorodavka = new Person("Martyn", "Borodavka",
                LocalDateTime.of(LocalDate.of(1736, Month.JULY, 10), LocalTime.now()));

        martynBorodavka.setPassport(new Passport()); //we cannot create passports at all. we are not allowed to do it
        passportDepartment.applyForPerson(martynBorodavka, "Khmelnytskiy",
                new BufferedImage(3, 4, 0)); //but passport department can create it for us

        /*
            you also cannot update your password details manually
         */
        martynBorodavka.getPassport().setPhoto(new BufferedImage(3, 4, 0));

        /*
            but passport department can
         */
        passportDepartment.updatePhoto(martynBorodavka, new BufferedImage(3, 4, 0));

    }

}
