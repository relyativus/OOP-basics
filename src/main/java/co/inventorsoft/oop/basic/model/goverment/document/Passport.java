package co.inventorsoft.oop.basic.model.goverment.document;

import java.awt.image.BufferedImage;
import java.time.LocalDateTime;

public class Passport implements PersonIdentity {

    private static int ID_COUNTER = 0;

    private String personId;

    private String firstName;

    private String lastName;

    private LocalDateTime dateOfBirth;

    private BufferedImage photo;

    private String address;

    Passport(final String firstName,
             final String lastName,
             final LocalDateTime dateOfBirth,
             final BufferedImage photo,
             final String address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
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
        return dateOfBirth;
    }

    public BufferedImage getPhoto() {
        return photo;
    }

    public String getAddress() {
        return address;
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
