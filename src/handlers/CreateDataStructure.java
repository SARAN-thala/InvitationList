package handlers;

import personDetails.Address;
import personDetails.Gender;
import personDetails.Name;
import personDetails.Person;

import java.util.ArrayList;
import java.util.Objects;

public class CreateDataStructure {
    private final String guestDetails;
    private ArrayList<Person> arrayList = new ArrayList<>();
    public CreateDataStructure(String records){
        this.guestDetails = records;
    }

    public ArrayList<Person> getList() {
        String[] fileContent = guestDetails.split("\n");
        for (int i = 0; i < fileContent.length; i++) {
            String[] detail = fileContent[i].split(",");
            arrayList.add(initializeInfo(detail));
        }
        return arrayList;
    }

    public Person initializeInfo(String[] detail) {
        Name name = new Name(detail[0], detail[1]);
        Gender gender = Objects.equals(detail[2], "Female") ? Gender.Female : Gender.Male;
        int age = Integer.parseInt(detail[3]);
        Address address = new Address(detail[4], detail[5], detail[6]);
        return new Person(name, gender, age, address);
    }
}
