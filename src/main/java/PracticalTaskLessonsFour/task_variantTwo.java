package PracticalTaskLessonsFour;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class task_variantTwo {
    /*
   Реализовать консольное приложение, которое:
1. Принимает от пользователя и “запоминает” строки.
2. Если введено print, выводит строки так, чтобы последняя введенная была первой в списке, а первая - последней.
3. Если введено revert, удаляет предыдущую введенную строку из памяти.
4. Если введено exit, то программа завершается

> - ввод в консоль (stdin), < - вывод на консоль (stdout)
> java
> python
> c#
> print
< [c#, python, java]
> revert
> print
< [python, java]
> revert
> revert
> print
< []
> revert -> throw new NoSuchElementException
    */

    // Данный вариант "кривой". Зачем оставил? Не знаю.
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
                Collections.reverse(linkedList);
                System.out.println(linkedList);
                Collections.reverse(linkedList);
            } else if (massage.equalsIgnoreCase("revert")) {
                linkedList.removeLast();
            } else {
                linkedList.add(massage);
            }
        } while (!massage.equalsIgnoreCase("exit"));
    }
}
