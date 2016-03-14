package handlers;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {
    private final String fileName;

    public ReadFile(String fileName) {
        this.fileName = fileName;
    }

    public String fileContent() throws IOException {
        File file = new File(fileName);
        FileReader fileReader = new FileReader(file);
        char[] contents = new char[(int) file.length()];
        fileReader.read(contents);
        String invites = new String(contents);
        return invites;
    }
}
