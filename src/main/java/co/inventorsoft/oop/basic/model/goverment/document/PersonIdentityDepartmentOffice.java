package co.inventorsoft.oop.basic.model.goverment.document;

import co.inventorsoft.oop.basic.model.Person;

public class PersonIdentityDepartmentOffice implements PersonIdentityDepartment {

    @Override
    public void create(Person person, DocumentDetails documents) {
        final PersonIdentity personIdentity = documents.create();
        person.setPersonIdentity(personIdentity);
    }

    @Override
    public void update(Person person, DocumentDetails documents) {
        final PersonIdentity personIdentity = documents.create();
        person.setPersonIdentity(personIdentity);
    }

}
