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

        final PassportDocuments martynsDocuments = new PassportDocuments(
                martynBorodavka.getFirstName(),
                martynBorodavka.getLastName(),
                martynBorodavka.getBirthDate(),
                "Khmelnytskii",
                new BufferedImage(3, 4, 1)
        );

        personIdentityDepartment.create(martynBorodavka, martynsDocuments);
        System.out.println("Identity document for Martyn " + martynBorodavka.getPersonIdentity().getClass());

        final Person newBorn = new Person("Ivan", "Ivanenko");
        final BirthCertificateDocuments newBornsDocuments = new BirthCertificateDocuments(
                newBorn.getFirstName(),
                newBorn.getLastName(),
                newBorn.getBirthDate(),
                "Chernivtsi"
        );
        personIdentityDepartment.create(newBorn, newBornsDocuments);
        System.out.println("Identity document for newborn " + newBorn.getPersonIdentity().getClass());
    }

}
