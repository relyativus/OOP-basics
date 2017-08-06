package co.inventorsoft.oop.basic.model.goverment.document;

import co.inventorsoft.oop.basic.model.AbstractPersonInfo;

import java.time.LocalDateTime;

public class BirthCertificate extends AbstractPersonInfo implements PersonIdentity {
    private static int ID_COUNTER = 0;

    private String personId;

    private String address;

    BirthCertificate(final String firstName, final String lastName, final LocalDateTime birthDate, final String address) {
        super(firstName, lastName, birthDate);
        this.address = address;
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

    @Override
    public LocalDateTime getBirthDate() {
        return birthDate;
    }
}
