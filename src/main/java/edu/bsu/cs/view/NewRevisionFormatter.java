package edu.bsu.cs.view;
import edu.bsu.cs.model.FormatInterface;
import edu.bsu.cs.model.Revision;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class NewRevisionFormatter implements FormatInterface {

    @Override
    public String format(Revision r) {
        return String.format("A change was made by %s on %s",
                r.name,
                DateTimeFormatter.ofPattern("MM-dd-yyyy hh:mm")
                        .withLocale(Locale.getDefault())
                        .withZone(ZoneId.systemDefault())
                        .format(r.timestamp));
    }
}
