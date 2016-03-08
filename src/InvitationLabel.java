import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class InvitationLabel {
    protected String[] records;

    public InvitationLabel(String[] records) {
        this.records = records;
    }

    public ArrayList<String> getFormalInvitation(String records) throws IOException{
        ReadFile readFile = new ReadFile(records);
        List<String> lines = readFile.getList();
        ArrayList<String> list = new ArrayList<>();
        for (String line : lines) {
            String[] array = line.split(",");
            Gender gender = array[2].contains("Female") ? Gender.Female : Gender.Male;
            Address address = new Address(array[4],array[5],array[6]);
            int age = Integer.parseInt(array[3]);
            Name name = new Name(array[0],array[1]);
            Person person = new Person(name,gender,age,address);
        }
        return list;
    }
}
