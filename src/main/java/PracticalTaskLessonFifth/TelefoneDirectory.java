package PracticalTaskLessonFifth;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class TelefoneDirectory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<String, ArrayList<String>> telephoneDirectory = new HashMap<>();
        ArrayList<String> telephoneNumbers;
        String inputCommand;
        System.out.println("""
                Здравствуйте пользователь вы находитесь в телефонном справочнике.
                Для взаимодействием со справочником имеются команды:
                1. ADD Lastname Phone-number - добавление телефонного номера в справочник. Phone-number - вводится без пробелов.
                    Пример: ADD Ivanov 99999999999;
                2. GET Lastname - получить все телефонные номера относящиеся к данному абоненту.
                    Пример: GET Ivanov;
                3. REMOVE Lastname - удалить абонента из телефонной книги;
                    Пример: REMOVE Ivanov;
                4. LIST - вывести всю информацию;
                5. EXIT - выход из программы.
                """);

        while (true) {
            System.out.println("Введите команду:");
            inputCommand = scanner.nextLine();
            String[] enteredMessage = inputCommand.trim().split(" ");
            String enteredCommands = enteredMessage[0];
            String enteredUser;
            String enteredTelephone;
            if (enteredCommands.equalsIgnoreCase("exit")) {
                System.out.println("Завершение работы программы.");
                break;
            }
            if (enteredCommands.equalsIgnoreCase("add")) {
                enteredUser = enteredMessage[1];
                enteredTelephone= enteredMessage[2];
                if (enteredMessage.length != 3) {
                    System.out.println("Ошибка ввода. Попробуйте еще раз.");
                    continue;
                }
                if (telephoneDirectory.get(enteredUser) == null) {
                    telephoneNumbers = new ArrayList<>();
                } else {
                    telephoneNumbers = telephoneDirectory.get(enteredUser);
                }
                telephoneNumbers.add(enteredTelephone);
                telephoneDirectory.put(enteredUser, telephoneNumbers);
            }
            if (enteredCommands.equalsIgnoreCase("get")) {
                enteredUser = enteredMessage[1];
                if (telephoneDirectory.get(enteredUser) == null) {
                    System.out.println("Не найдена запись с фамилией " + enteredUser);
                } else {
                    telephoneNumbers = telephoneDirectory.get(enteredUser);
                    System.out.println(enteredUser + " -> " + telephoneNumbers);
                }
            }
            if (enteredCommands.equalsIgnoreCase("remove")) {
                enteredUser = enteredMessage[1];
                if (telephoneDirectory.get(enteredUser) == null) {
                    System.out.println("Не найдена запись с фамилией " + enteredUser);
                } else {
                    telephoneDirectory.remove(enteredUser);
                    System.out.println("Запись с фамилией " + enteredUser + " удалена");
                }
            }
            if (enteredCommands.equalsIgnoreCase("list")) {
                if (telephoneDirectory.isEmpty()) {
                    System.out.println("Не найдено ни одной записи в телефонном справочнике");
                } else {
                    System.out.println(telephoneDirectory);
                }
            }
        }
    }
}
