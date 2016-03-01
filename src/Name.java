
public class Name {
    protected String firstName;
    protected String lastName;

    public Name(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String firstLast(String separator) {
        return firstName + separator + lastName;
    }

    public String lastFirst(String separator) {
        return lastName + separator + firstName;
    }
}
