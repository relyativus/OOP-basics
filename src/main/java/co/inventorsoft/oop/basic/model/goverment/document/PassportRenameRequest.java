package co.inventorsoft.oop.basic.model.goverment.document;

public class PassportRenameRequest implements DocumentRequest {

    private String newFirstName;

    private String newLastName;

    private Passport oldPassport;

    public PassportRenameRequest(String newFirstName, String newLastName, Passport oldPassport) {
        this.newFirstName = newFirstName;
        this.newLastName = newLastName;
        this.oldPassport = oldPassport;
    }

    @Override
    public PersonIdentity create() {
        return new Passport(
                newFirstName,
                newLastName,
                oldPassport.getDateOfBirth(),
                oldPassport.getPhoto(),
                oldPassport.getAddress()
        );
    }
}
