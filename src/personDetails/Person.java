package personDetails;

import java.util.Objects;

public class Person {
    private final Name name;
    private final Address address;
    private final Age age;
    private final Gender gender;

    public Person(Name name, Gender gender, Age age, Address address) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.address = address;
    }

    public String getInformalName() {
        return gender.prefix() + name.firstLast();
    }

    public String getFormalName() {
        return gender.prefix() + name.lastFirst();
    }


    String getInformalNameWithAddress() {
        return getInformalName() + "\n" + address.getFullAddress();
    }

    String getFormalNameWithAddress() {
        return getFormalName() + "\n" + address.getFullAddress();
    }

    String getInformalNameWithCountry() {
        return getInformalName()+ ", " + address.getCountry();
    }

    String getFormalNameWithCountry() {
        return getFormalName()+ ", " + address.getCountry();
    }

    public String withNameAndCountry(String opt, String preferredCountry) {
        String countryName = "";
        if (address.getCountry().equals(preferredCountry))
            return getInformalName() + ", " + preferredCountry;
        return countryName;
    }

    public String withAddressAndAge(String opt, String country, int legalAge) {
        if (age.isOlderThan(legalAge))
            if (!(Objects.equals(withNameAndCountry(opt, country), "")))
                return withNameAndCountry(opt, country) + ", " + age.getAge();
        return "";
    }
}
