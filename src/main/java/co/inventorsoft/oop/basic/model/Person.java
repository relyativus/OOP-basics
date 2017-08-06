package co.inventorsoft.oop.basic.model;

import co.inventorsoft.oop.basic.model.goverment.document.PersonIdentity;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Person extends AbstractPersonInfo {

    private PersonIdentity personIdentity;

    /**
     * Constructor for existing persons
     *
     * @param firstName person's first name
     * @param lastName  person's last name
     * @param birthDate person's birth date
     */
    public Person(final String firstName, final String lastName, final LocalDateTime birthDate) {
        super(firstName, lastName, birthDate);
    }

    /**
     * Constructor for newborns
     *
     * @param firstName newborn first name
     * @param lastName  newborn last name
     */
    public Person(final String firstName, final String lastName) {
        this(firstName, lastName, LocalDateTime.now());
    }

    public String getFirstName() {
        return personIdentity == null ? firstName : personIdentity.getFirstName();
    }

    public String getLastName() {
        return personIdentity == null ? lastName : personIdentity.getLastName();
    }

    public PersonIdentity getPersonIdentity() {
        return personIdentity;
    }

    public void setPersonIdentity(PersonIdentity personIdentity) {
        this.personIdentity = personIdentity;
    }

    public LocalDateTime getBirthDate() {
        return personIdentity == null ? birthDate : personIdentity.getBirthDate();
    }

    public long getAge() {
        return ChronoUnit.YEARS.between(birthDate, LocalDateTime.now());
    }
}
