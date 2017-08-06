package co.inventorsoft.oop.basic.model.goverment.document;

import co.inventorsoft.oop.basic.model.Person;

import java.time.LocalDateTime;

public class BirthCertificateDocuments implements DocumentDetails {

    private String firstName;

    private String lastName;

    private LocalDateTime birthDate;

    private String address;

    public BirthCertificateDocuments(final Person person,
                                     final String address) {
        this.firstName = person.getFirstName();
        this.lastName = person.getLastName();
        this.address = address;
        this.birthDate = person.getBirthDate();
    }

    @Override
    public PersonIdentity create() {
        return new BirthCertificate(
                firstName,
                lastName,
                birthDate,
                address
        );
    }
}
