package co.inventorsoft.oop.basic.model.goverment.document;

import co.inventorsoft.oop.basic.model.Person;

import java.awt.image.BufferedImage;

public class PassportDocuments implements DocumentDetails {

    private String firstName;

    private String lastName;

    private String address;

    private BufferedImage photo;

    public PassportDocuments(final Person person, final String addres, final BufferedImage photo) {
        this.firstName = person.getFirstName();
        this.lastName = person.getLastName();
        this.address = addres;
        this.photo = photo;
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

    @Override
    public BufferedImage getPhoto() {
        return photo;
    }
}
