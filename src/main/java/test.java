import java.time.LocalDateTime;
import java.time.ZonedDateTime;

public class test {
    public static void main(String[] args) {
//        System.out.println(java.time.ZonedDateTime.now());
//        System.out.println(java.time.LocalDateTime.now());
        LocalDateTime date = LocalDateTime.now();
        ZonedDateTime zoneDate = ZonedDateTime.now();
        System.out.println(zoneDate);

    }
}
