import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ReadFile {
    private final String fileName;

    public ReadFile(String fileName) {
        this.fileName = fileName;
    }

    public ArrayList<Person> getList() throws IOException {
        File file = new File(this.fileName);
        String[] fileContent = readFile(file);
        ArrayList<Person> arrayList = new ArrayList<>();
        getFormal(fileContent,arrayList);
        return arrayList;
    }

    private void getFormal(String[] fileContent, ArrayList<Person> arrayList) {
        for (String aFileContent : fileContent) {
            String[] split = aFileContent.split(",");
            Person guest = initializeInfo(split);
            arrayList.add(guest);
        }
    }

    private Person initializeInfo(String[] split) {
        Name name = new Name(split[0], split[1]);
        Gender gender = split[2].contains("Female") ? Gender.Female : Gender.Male;
        int age = Integer.parseInt(split[3]);
        Address address = new Address(split[4],split[5],split[6]);
        return new Person(name,gender,age,address);
    }


    private String[] readFile(File file) throws IOException {
        FileReader fileReader = new FileReader(file);
        char[] chars = new char[(int) file.length()];
        fileReader.read(chars);
        String invites = new String(chars);
        return invites.split("\n");
    }
}
