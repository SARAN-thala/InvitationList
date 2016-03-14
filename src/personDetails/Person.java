package personDetails;

import java.util.Objects;

public class Person {
    private final Name name;
    private final Address address;
    private final int age;
    private final Gender gender;

    public Person(Name name, Gender gender, int age, Address address) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.address = address;
    }

    private String getName(boolean choice) {
        return (choice) ? name.firstLast() : name.lastFirst();
    }

    public String keyForNameFormat(String opt)  {
        if (opt.equals("--firstLast") || opt.equals("-f"))
            return gender + name.firstLast();
        if (opt.equals("--lastFirst") || opt.equals("-l"))
            return gender + name.lastFirst();
        return "";
    }

    public String getNameWithTitle(boolean choice) {
        return gender + getName(choice);
    }

    public String getAddress() {
        return getAddress(true);
    }

    public String getAddress(boolean choice) {
        String name = getName(choice);
        return gender + name + ", " + address.toString();
    }

    public String getNameWithCountry() {
        return getNameWithCountry(true);
    }

    public String getNameWithCountry(boolean choice) {
        String name = getName(choice);
        return gender + name + ", " + address.getCountry();
    }

    public String withAddressAndStyle(String opt, String preferredCountry){
        String countryName = "";
        if (address.getCountry().equals(preferredCountry))
            return keyForNameFormat(opt) + ", " + preferredCountry;
        return countryName;
    }

    public String withAddressAndAge(String opt, String country, String legalAge){
        if (Integer.parseInt(String.valueOf(age)) >= Integer.parseInt(legalAge))
            if (!(Objects.equals(withAddressAndStyle(opt, country), "")))
                return withAddressAndStyle(opt, country) + ", " + age;
        return "";
    }
}
