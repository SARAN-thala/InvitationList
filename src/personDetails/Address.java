package personDetails;

public class Address {
    private final String city, state, country;

    public Address(String city, String state, String country) {
        this.city = city;
        this.state = state;
        this.country = country;
    }


    public String getCountry() {
        return country;
    }

    public String getFullAddress() {
        return this.city + ", " + this.state + "\n" + this.country;
    }
}
