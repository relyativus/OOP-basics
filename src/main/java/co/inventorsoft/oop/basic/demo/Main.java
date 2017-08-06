package co.inventorsoft.oop.basic.demo;

import co.inventorsoft.oop.basic.model.Person;
import co.inventorsoft.oop.basic.model.goverment.document.BirthCertificateDocuments;
import co.inventorsoft.oop.basic.model.goverment.document.PassportDocuments;
import co.inventorsoft.oop.basic.model.goverment.document.PersonIdentityDepartment;
import co.inventorsoft.oop.basic.model.goverment.document.PersonIdentityDepartmentOffice;

import java.awt.image.BufferedImage;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class Main {

    private static final PersonIdentityDepartment personIdentityDepartment = new PersonIdentityDepartmentOffice();

    public static void main(String[] args) {
        final Person martynBorodavka = new Person("Martyn", "Borodavka",
                LocalDateTime.of(LocalDate.of(1736, Month.JULY, 10), LocalTime.now()));

        personIdentityDepartment.applyForPerson(martynBorodavka,
                new PassportDocuments(martynBorodavka, "Khmelnytskii", new BufferedImage(3, 4, 1)));
        System.out.println("Identity document for Martyn " + martynBorodavka.getPersonIdentity().getClass());

        final Person newBorn = new Person("Ivan", "Ivanenko");
        personIdentityDepartment.applyForPerson(newBorn,
                new BirthCertificateDocuments(newBorn, "Chernivtsi"));
        System.out.println("Identity document for newborn " + newBorn.getPersonIdentity().getClass());
    }

}
