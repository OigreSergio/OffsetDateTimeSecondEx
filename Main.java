import java.time.DayOfWeek;
import java.time.Month;
import java.time.OffsetDateTime;
import java.time.Year;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        OffsetDateTime newDate = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        int yearOfDate = newDate.getYear();
        System.out.println("Year : "+yearOfDate);
        Month monthOfData = newDate.getMonth();
        System.out.println("Month : "+ monthOfData);
        int numberOfDay = newDate.getDayOfMonth();
        System.out.println("Number of day : "+numberOfDay);
        DayOfWeek dayOfWheek = newDate.getDayOfWeek();
        System.out.println("Name of day : "+dayOfWheek);
    }
}
