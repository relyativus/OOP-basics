package co.inventorsoft.oop.basic.model.goverment.document;

import co.inventorsoft.oop.basic.model.Person;

public class PersonIdentityDepartmentOffice implements PersonIdentityDepartment {

    private PassportDepartment passportDepartment = new PassportDepartment();

    private BirthCertificateDepartment birthCertificateDepartment = new BirthCertificateDepartment();

    @Override
    public void applyForPerson(Person person, DocumentDetails documents) {
        getDepartmentByDocuments(documents).applyForPerson(person, documents);
    }

    @Override
    public void update(Person person, DocumentDetails documents) {
        getDepartmentByDocuments(documents).update(person, documents);
    }

    private PersonIdentityDepartment getDepartmentByDocuments(DocumentDetails documentDetails) {
        return documentDetails instanceof PassportDocuments ? passportDepartment : birthCertificateDepartment;
    }
}
