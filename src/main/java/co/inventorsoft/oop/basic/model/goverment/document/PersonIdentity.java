package co.inventorsoft.oop.basic.model.goverment.document;

public interface PersonIdentity {

    String getPersonId();

    String getFirstName();

    String getLastName();

    String getAddress();

    //em... passport needs photo, but birth certificate doesn't
}
