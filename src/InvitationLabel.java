import java.util.ArrayList;

public class InvitationLabel {
    private final ArrayList<Person> personalDetails;
    private ArrayList<String> list = new ArrayList<>();

    public InvitationLabel(ArrayList<Person> details) {
        this.personalDetails = details;
    }

    public String getNamesWithAddress(String opt, String preferredCountry) throws Exception {
//        list.clear();
        for (Person p : personalDetails) {
            String representation = p.withAddressAndStyle(opt, preferredCountry);
            if (!representation.equals(""))
                list.add(representation);
        }
        return representation();
    }

    public String getName(String opt)  {
//        list.clear();
        for (Person p : personalDetails) {
            String representation = p.keyForNameFormat(opt);
            list.add(representation);
        }
        return representation();
    }

    public String representation() {
        String str = "";
        for (int i = 0; i < list.size(); i++) {
            str += (i == list.size() - 1) ? list.get(i) : list.get(i) + "\n";
        }
        return str;
    }

    public String getNameWithAge(String opt, String country, String age) throws Exception {
//        list.clear();
        for (Person p : personalDetails) {
            String representation = p.withAddressAndAge(opt, country, age);
            if (!(representation.equals("")))
                list.add(representation);
        }
        return representation();
    }
}