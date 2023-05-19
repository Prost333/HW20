import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {

        DateTimeFormatter dateTimeFormatter=DateTimeFormatter.ofPattern("G qqq dd MMM yyyy:' time:' HH:mm ss");
        LocalDateTime localDateTime= LocalDateTime.now();
        System.out.println(localDateTime.format(dateTimeFormatter));
        DateTimeFormatter dateTimeFormatter1=DateTimeFormatter.ofPattern("G qqq dd MMM yyyy:' time:' hh:mm ss a");
        LocalDateTime localDateTime1= LocalDateTime.now();
        System.out.println(localDateTime1.format(dateTimeFormatter1));
    }
}