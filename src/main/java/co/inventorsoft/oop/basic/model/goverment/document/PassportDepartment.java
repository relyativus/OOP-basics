package co.inventorsoft.oop.basic.model.goverment.document;

import co.inventorsoft.oop.basic.model.Person;

/**
 * Responsible for passport management process
 */
public class PassportDepartment implements PersonIdentityDepartment {

    @Override
    public void applyForPerson(Person person, DocumentDetails documents) {
        final Passport passport = new Passport(
                documents.getFirstName(),
                documents.getLastName(),
                person.getBirthDate(),
                documents.getPhoto(),
                documents.getAddress()
        );
        person.setPersonIdentity(passport);
    }

    @Override
    public void update(Person person, DocumentDetails documents) {
        applyForPerson(person, documents);
    }
}
