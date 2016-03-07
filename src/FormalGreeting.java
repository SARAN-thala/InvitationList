import java.util.List;

public class FormalGreeting {

    private String fileName;
    private String countryName;

    public FormalGreeting(String[] args) {
        this.fileName = args[0];
        this.countryName = args[1];
    }

    public void getFormalRepresentation() {
        ReadFile readFile = new ReadFile(fileName);
        List<String> lines = readFile.getList();
        for (String line : lines) {
            String[] array = line.split(",");
            Gender g = array[2].contains("Female") ? Gender.Female : Gender.Male;
            if (array[6].contains(countryName)) {
//                Person eachGuest = new Person(array[0], array[1], g, array[3], array[4], array[5], array[6]);
//                System.out.println(eachGuest.getLastNameFirstAndCountry());
            }
        }
    }
}
