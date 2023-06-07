import java.time.LocalTime;
import java.util.Scanner;

public class taskThree {
//    В консоли запросить имя пользователя. В зависимости от текущего времени, вывести приветствие вида:
//            "Доброе утро, <Имя>!", если время от 05:00 до 11:59
//            "Добрый день, <Имя>!", если время от 12:00 до 17:59;
//"Добрый вечер, <Имя>!", если время от 18:00 до 22:59;
//"Доброй ночи, <Имя>!", если время от 23:00 до 4:59
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LocalTime morningTime = LocalTime.of(11, 59);
        LocalTime dayTime = LocalTime.of(17, 59);
        LocalTime eveningTime = LocalTime.of(22, 59);
        LocalTime nightTime = LocalTime.of(4, 59);
        LocalTime localTime = LocalTime.now();

        System.out.println("Введите имя пользователя:");
        String userName = scanner.next();

        if ((localTime.isAfter(nightTime) && localTime.isBefore(morningTime)) || localTime.equals(morningTime))
            System.out.println("Доброе утро, " + userName);
        else if ((localTime.isAfter(morningTime) && localTime.isBefore(dayTime)) || localTime.equals(dayTime))
            System.out.println("Добрый день, " + userName);
        else if ((localTime.isAfter(dayTime) && localTime.isBefore(eveningTime)) || localTime.equals(eveningTime))
            System.out.println("Добрый вечер, " + userName);
        else System.out.println("Доброй ночи, " + userName);



        }

    }
