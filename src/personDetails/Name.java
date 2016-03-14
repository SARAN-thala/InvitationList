package personDetails;

public class Name {
    private final String firstName;
    private final String lastName;

    public Name(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String firstLast() {
        return this.firstName + " " + this.lastName;
    }

    public String lastFirst() {
        return this.lastName + ", " + this.firstName;
    }
}