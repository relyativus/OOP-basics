package co.inventorsoft.oop.basic.model.goverment.document;

import co.inventorsoft.oop.basic.model.AbstractPersonInfo;

import java.awt.image.BufferedImage;
import java.time.LocalDateTime;

public class Passport extends AbstractPersonInfo implements PersonIdentity {

    private static int ID_COUNTER = 0;

    private String personId;

    private BufferedImage photo;

    private String address;

    Passport(final String firstName,
             final String lastName,
             final LocalDateTime dateOfBirth,
             final BufferedImage photo,
             final String address) {
        super(firstName, lastName, dateOfBirth);
        this.photo = photo;
        this.address = address;
        this.personId = "KR" + ID_COUNTER++;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public LocalDateTime getDateOfBirth() {
        return birthDate;
    }

    public BufferedImage getPhoto() {
        return photo;
    }

    public String getAddress() {
        return address;
    }

    @Override
    public LocalDateTime getBirthDate() {
        return birthDate;
    }

    @Override
    public String getPersonId() {
        return personId;
    }

    void setPhoto(BufferedImage photo) {
        this.photo = photo;
    }

    void setAddress(String address) {
        this.address = address;
    }
}
