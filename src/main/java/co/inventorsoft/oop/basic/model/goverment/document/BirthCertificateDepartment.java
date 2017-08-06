package co.inventorsoft.oop.basic.model.goverment.document;

import co.inventorsoft.oop.basic.model.Person;

public class BirthCertificateDepartment implements PersonIdentityDepartment {

    @Override
    public void applyForPerson(Person person, DocumentDetails documents) {
        final BirthCertificate birthCertificate = new BirthCertificate(
                documents.getFirstName(),
                documents.getLastName(),
                person.getBirthDate(),
                documents.getAddress()
        );
        person.setPersonIdentity(birthCertificate);
    }

    @Override
    public void update(Person person, DocumentDetails documents) {
        applyForPerson(person, documents);
    }
}
