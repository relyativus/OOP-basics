package co.inventorsoft.oop.basic.model.goverment.document;

import co.inventorsoft.oop.basic.model.Person;

import java.awt.image.BufferedImage;

public class BirthCertificateDocuments implements DocumentDetails {

    private String firstName;

    private String lastName;

    private String address;

    public BirthCertificateDocuments(final Person person,
                                     final String address) {
        this.firstName = person.getFirstName();
        this.lastName = person.getLastName();
        this.address = address;
    }

    @Override
    public String getFirstName() {
        return firstName;
    }

    @Override
    public String getLastName() {
        return lastName;
    }

    @Override
    public String getAddress() {
        return address;
    }

    //well will return null. Or even better - can throw some fancy exception
    @Override
    public BufferedImage getPhoto() {
        throw new IllegalStateException("Birth certificate doesn't need photo");
    }
}
