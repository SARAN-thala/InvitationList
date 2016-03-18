package factory;

import personDetails.Person;

import java.util.ArrayList;

class InvitationLabel {
    private final ArrayList<Person> personalDetails;
    private ArrayList<String> list = new ArrayList<>();

    InvitationLabel(ArrayList<Person> details) {
        this.personalDetails = details;
    }

    String getNamesWithAddress(String opt, String preferredCountry) {
        for (Person p : personalDetails) {
            String representation = p.withNameAndCountry(opt, preferredCountry);
            if (!representation.equals(""))
                list.add(representation);
        }
        return representation();
    }

    String getName(String opt) {
        for (Person p:personalDetails) {
            if (opt.equals("--firstLast") || opt.equals("-f")) {
                return p.getInformalName();
            }
            if (opt.equals("--lastFirst") || opt.equals("-l")) {
                return p.getFormalName();
            }
            return "";
        }
        return representation();
    }

    private String representation() {
        String str = "";
        for (int i = 0; i < list.size(); i++) {
            str += (i == list.size() - 1) ? list.get(i) : list.get(i) + "\n";
        }
        return str;
    }

    String getNameWithAge(String opt, String country, int age) {
        for (Person p : personalDetails) {
            String representation = p.withAddressAndAge(opt, country, age);
            if (!(representation.equals("")))
                list.add(representation);
        }
        return representation();
    }
}