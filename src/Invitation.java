import org.apache.commons.cli.CommandLine;

import java.io.IOException;
import java.util.List;

public class Invitation {
    public static void main(String[] args) throws IOException {
        CLi cli = new CLi(args);
        CommandLine cmds = cli.parse();
        String[] files = cmds.getArgs();
        System.out.println("files " + files[0]);
        System.out.println(cmds.getOptions());
        ReadFile readFile = new ReadFile(files[0]);
        List<String> data = readFile.getList();
    }
}
