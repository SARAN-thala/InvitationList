package factory;

import handlers.GuestList;
import handlers.ReadFile;

import java.io.IOException;

public class LabelPrinter {

    public static void main(String[] args) throws IOException {
        ReadFile readFile = new ReadFile(args[1]);
        String guestDetails = readFile.fileContent();
//        OptionHandler handler = new OptionHandler(args);
//        handler.getOptions
        GuestList guestRecords = new GuestList(guestDetails);
        InvitationLabel invitationLabel = new InvitationLabel(guestRecords.getList());

        if (args.length == 2)
            System.out.println(invitationLabel.getName(args[0]));
        if (args.length == 3)
            System.out.println(invitationLabel.getNamesWithAddress(args[0], args[2]));
        if (args.length == 4)
            System.out.println(invitationLabel.getNameWithAge(args[0], args[2], Integer.parseInt(args[3])));
    }
}
