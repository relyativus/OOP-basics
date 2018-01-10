package co.inventorsoft.oop.basic.model.goverment.document;

import co.inventorsoft.oop.basic.model.AbstractPersonInfo;

import java.time.LocalDateTime;

public class BirthCertificateDocuments extends AbstractPersonInfo implements DocumentRequest {

    private String address;

    public BirthCertificateDocuments(final String firstName,
                                     final String lastName,
                                     final LocalDateTime birthDate,
                                     final String address) {
        super(firstName, lastName, birthDate);
        this.address = address;
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
