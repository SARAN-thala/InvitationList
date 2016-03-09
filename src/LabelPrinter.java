import java.util.ArrayList;

public class LabelPrinter {

    public static void main(String[] args) throws Exception {
        ReadFile readFile = new ReadFile(args[1]);
        ArrayList<Person> list = readFile.getList();
        InvitationLabel invitationLabel = new InvitationLabel(list);
        if (args.length==2)
            System.out.println(invitationLabel.getName(args[0]));
        if (args.length==3)
            System.out.println(invitationLabel.getNamesWithAddress(args[0],args[2]));
        else
            System.out.println(invitationLabel.getNameWithAge(args[0],args[2],args[3]));
    }
}