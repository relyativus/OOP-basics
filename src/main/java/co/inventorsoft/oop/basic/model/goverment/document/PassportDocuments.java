package co.inventorsoft.oop.basic.model.goverment.document;

import co.inventorsoft.oop.basic.model.AbstractPersonInfo;

import java.awt.image.BufferedImage;
import java.time.LocalDateTime;

public class PassportDocuments extends AbstractPersonInfo implements DocumentDetails {

    private String address;

    private BufferedImage photo;

    public PassportDocuments(final String firstName, final String lastName, final LocalDateTime dateOfBirth,
                             final String address, final BufferedImage photo) {
        super(firstName, lastName, dateOfBirth);
        this.address = address;
        this.photo = photo;
    }

    @Override
    public PersonIdentity create() {
        return new Passport(
                firstName,
                lastName,
                birthDate,
                photo,
                address
        );
    }
}
