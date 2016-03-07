public class Person {
    private Name name;
    private Address address;
    private int age;
    private Gender gender;

    public Person(Name name, Address address,Gender gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.address = address;
    }

    private String getName(boolean choice) {
        return (choice) ? name.firstLast() : name.lastFirst();
    }

    public String getNameWithTitle(boolean choice){
        return gender.title()+getName(choice);
    }

    public String getAddress() {
        return getAddress(true);
    }

    public String getAddress(boolean choice) {
        String name = getName(choice);
        return name + "\n" + address.toString();
    }

    public String getNameWithCountry() {
        return getNameWithCountry(true);
    }

    public String getNameWithCountry(boolean choice) {
        String name = getName(choice);
        return gender.title()+name + ", " + address.getCountry();
    }
}
