package handlers;

import personDetails.*;

import java.util.ArrayList;
import java.util.Objects;

public class GuestList {
    private final String guestDetails;
    private ArrayList<Person> arrayList = new ArrayList<>();
    public GuestList(String records){
        this.guestDetails = records;
    }

    public ArrayList<Person> getList() {
        String[] fileContent = guestDetails.split("\n");
        for (String aFileContent : fileContent) {
            String[] detail = aFileContent.split(",");
            arrayList.add(initializeInfo(detail));
        }
        return arrayList;
    }

    private Person initializeInfo(String[] detail) {
        Name name = new Name(detail[0], detail[1]);
        Gender gender = Objects.equals(detail[2], "Female") ? Gender.Female : Gender.Male;
        Age age = new Age(Integer.parseInt(detail[3]));
        Address address = new Address(detail[4], detail[5], detail[6]);
        return new Person(name, gender, age, address);
    }
}
