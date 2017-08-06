package co.inventorsoft.oop.basic.model.goverment.document;

import java.time.LocalDateTime;

public class BirthCertificate implements PersonIdentity {
    private static int ID_COUNTER = 0;

    private String personId;

    private String firstName;

    private String lastName;

    private LocalDateTime birthDate;

    private String address;

    BirthCertificate(final String firstName, final String lastName, final LocalDateTime birthDate, final String address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.birthDate = birthDate;
        this.personId = "BC" + ID_COUNTER++;
    }

    @Override
    public String getPersonId() {
        return personId;
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
}
