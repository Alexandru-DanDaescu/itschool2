package session_31javaCoreRecap;

import java.util.ArrayList;
import java.util.List;

public class FormatTableRecords {

    public static void main(String[] args) {
        List<Record> userRecords = new ArrayList<>();
        userRecords.add(new Record("ABC", "abc@abc.com"));
        userRecords.add(new Record("Daniel","Prefericit@god.ro"));
        String username = "Protopescu";
        String customFormat = "%-15s | %-20s%n";
        System.out.printf(customFormat, "Name", "email");
        userRecords.forEach((userRecord) -> System.out.printf(customFormat, userRecord.getName(), userRecord.getEmail()));
        String.format(username, customFormat);
    }

//    private static void formatUserRecords(List<Record> userRecords){
//        int maxWidth =
//    }
}

class Record {
    private  String name;
    private  String email;

    public Record(String name, String email){
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}