import org.apache.commons.cli.*;

public class CLi {
    private String[] args = null;
    private Options options = new Options();

    public CLi(String[] args) {

        this.args = args;

        options.addOption("h", "help", false, "Show help");
        options.addOption("f", "char", false, "First last name");
        options.addOption("l", "char", false, "Last first name");
        options.addOption("c", "char", false, "Name with Country");

    }

    public CommandLine parse() {

        CommandLineParser parser = new BasicParser();

        CommandLine cmd = null;
        try {
            cmd = parser.parse(options, args);
        } catch (ParseException e) {
            help();
        }
        return cmd;
    }

    private void help() {
        HelpFormatter formater = new HelpFormatter();
        formater.printHelp("Invitation", options);
        System.exit(0);
    }
}
