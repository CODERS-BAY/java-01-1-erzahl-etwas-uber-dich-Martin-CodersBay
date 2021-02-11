import java.time.LocalDate;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
        int age = 31;
        char sex = 'm';
        String firstname = "Martin";
        String surname = "Hohla";
        double marks = 1.9;
        boolean married = false;
        Date myBirthday = new Date(604882800000L);

        System.out.println(firstname + " " + surname + " " + "Geschlecht: " + sex + " Married: " + married + " Notendurchschnitt: " + marks + " Birthdate: " + myBirthday);

    }
}