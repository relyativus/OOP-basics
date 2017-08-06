package co.inventorsoft.oop.basic.model;

import java.time.LocalDateTime;

public abstract class AbstractPersonInfo {

    protected String firstName;

    protected String lastName;

    protected LocalDateTime birthDate;

    public AbstractPersonInfo(String firstName, String lastName, LocalDateTime birthDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
    }
}
