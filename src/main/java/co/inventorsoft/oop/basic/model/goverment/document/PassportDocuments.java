package co.inventorsoft.oop.basic.model.goverment.document;

import co.inventorsoft.oop.basic.model.Person;

import java.awt.image.BufferedImage;
import java.time.LocalDateTime;

public class PassportDocuments implements DocumentDetails {

    private String firstName;

    private String lastName;

    private String address;

    private LocalDateTime dateOfBirth;

    private BufferedImage photo;

    public PassportDocuments(final Person person, final String address, final BufferedImage photo) {
        this.firstName = person.getFirstName();
        this.lastName = person.getLastName();
        this.address = address;
        this.photo = photo;
        this.dateOfBirth = person.getBirthDate();
    }

    @Override
    public PersonIdentity create() {
        return new Passport(
                firstName,
                lastName,
                dateOfBirth,
                photo,
                address
        );
    }
}
