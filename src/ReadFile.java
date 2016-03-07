import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.util.List;

public class ReadFile {
    private String fileName;

    public ReadFile(String fileName) {
        this.fileName = fileName;
    }

    public List<String> getList(){
        File file = new File(this.fileName);
        List<String> lines = null;
        try {
            lines = Files.readAllLines(file.toPath(), Charset.defaultCharset());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return lines;
    }
}
