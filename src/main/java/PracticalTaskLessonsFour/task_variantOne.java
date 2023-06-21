package PracticalTaskLessonsFour;

import java.util.LinkedList;
import java.util.Scanner;

public class task_variantOne {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        String massage;
        System.out.println("""
                Команды для взаимодействия:
                1. print - показать ранее введенные строки;
                2. revert - удалить последнюю введенную строку;
                3. exit - выйти из программы.""");

        do {
            System.out.println("Введите строку:");
            massage = scanner.next();
            if (massage.equalsIgnoreCase("print")) {
                System.out.println(linkedList);
            } else if (massage.equalsIgnoreCase("revert")) {
                linkedList.removeFirst();
            } else {
                linkedList.addFirst(massage);
            }
        } while (!massage.equalsIgnoreCase("exit"));
    }
}
