package co.inventorsoft.oop.basic.model.goverment.document;

import co.inventorsoft.oop.basic.model.Person;

import java.awt.image.BufferedImage;

/**
 * Responsible for passport management process
 */
public class PassportDepartment {

    public void applyForPerson(Person person, String currentAddress, BufferedImage photo) {
        final Passport personsPassport = new Passport(
                person.getFirstName(),
                person.getLastName(),
                person.getBirthDate(),
                photo,
                currentAddress
        );
        person.setPassport(personsPassport);
    }

    public void updatePhoto(Person person, BufferedImage newPhoto) {
        person.getPassport().setPhoto(newPhoto);
    }

    public void updateAddress(Person person, String newAddress) {
        person.getPassport().setAddress(newAddress);
    }
}
