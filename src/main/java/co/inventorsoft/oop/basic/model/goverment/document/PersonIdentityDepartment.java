package co.inventorsoft.oop.basic.model.goverment.document;

import co.inventorsoft.oop.basic.model.Person;

public interface PersonIdentityDepartment {

    void create(Person person, DocumentDetails documents);

    void update(Person person, DocumentDetails documents);
}
