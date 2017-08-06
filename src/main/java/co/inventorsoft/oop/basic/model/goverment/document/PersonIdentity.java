package co.inventorsoft.oop.basic.model.goverment.document;

import java.time.LocalDateTime;

public interface PersonIdentity {

    String getPersonId();

    String getFirstName();

    String getLastName();

    String getAddress();

    LocalDateTime getBirthDate();
}
