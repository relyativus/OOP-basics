package co.inventorsoft.oop.basic.model;

import java.awt.image.BufferedImage;
import java.time.LocalDateTime;

public class Passport {

    private String firstName;

    private String lastName;

    private LocalDateTime dateOfBirth;

    private BufferedImage photo;

    private String address;

    public Passport(final String firstName,
                    final String lastName,
                    final LocalDateTime dateOfBirth,
                    final BufferedImage photo,
                    final String address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.photo = photo;
        this.address = address;
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

    public void setPhoto(BufferedImage photo) {
        this.photo = photo;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
