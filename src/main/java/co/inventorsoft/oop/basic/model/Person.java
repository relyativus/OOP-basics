package co.inventorsoft.oop.basic.model;

import co.inventorsoft.oop.basic.model.goverment.document.PersonIdentity;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Person {

    private String firstName;

    private String lastName;

    private PersonIdentity personIdentity;

    private LocalDateTime birthDate;

    /**
     * Constructor for existing persons
     *
     * @param firstName person's first name
     * @param lastName  person's last name
     * @param birthDate person's birth date
     */
    public Person(final String firstName, final String lastName, final LocalDateTime birthDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
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
        return personIdentity.getFirstName();
    }

    public String getLastName() {
        return personIdentity.getLastName();
    }

    public PersonIdentity getPersonIdentity() {
        return personIdentity;
    }

    public void setPersonIdentity(PersonIdentity personIdentity) {
        this.personIdentity = personIdentity;
    }

    public LocalDateTime getBirthDate() {
        return birthDate;
    }

    public long getAge() {
        return ChronoUnit.YEARS.between(birthDate, LocalDateTime.now());
    }
}
