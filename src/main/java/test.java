import java.util.Scanner;

public class test {
    public static int userRequest(String userMessage){
        Scanner scanner = new Scanner(System.in);
        int number;
        while (true) {
            System.out.println(userMessage);
            try {
                number = Integer.parseInt(scanner.next());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Ошибка ввода! Попробуйте еще раз.");
            }
        }
        return number;
    }
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Please enter a vowel, lowercase!");
//        while (!sc.hasNextLine()) {
//            System.out.println("That not a vowel!");
//            sc.next();
//        }
//        String vowel = sc.next();
        int i, j;
        int[][] mas = new int[5][5];

        for (i = 0; i < 5; ++i) {
            for (j = 0; j < 5; ++j) {
                mas[i][j] = (int) (Math.random() * 20 - 10);
                System.out.printf("%2d ", mas[i][j]);
            }

            System.out.println();
        }
    }
}
