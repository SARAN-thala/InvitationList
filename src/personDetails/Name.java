package personDetails;

public class Name {
    private final String firstName;
    private final String lastName;

    public Name(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    String firstLast() {
        return String.format("%s %s", this.firstName, this.lastName);
    }

    String lastFirst() {
        return String.format("%s, %s", this.lastName, this.firstName);
    }
}
