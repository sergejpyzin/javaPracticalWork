import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i;
        while (true) {
            System.out.print("message");
            try {
                i = Integer.parseInt(sc.next());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Неверный ввод!");
            }
        }

//        Scanner scanner = new Scanner(System.in);
//        boolean checking = scanner.hasNext();
//        String s = "";
//        while (checking) {
//            s = scanner.next();
//            checking = false;
//
//        }
//        scanner.close();
//        System.out.println(s);

    }
}
