package PracticalTaskLessonTwo;

import java.util.Random;
import java.util.Scanner;

public class library {

    public static int[] fillingRandomArray(int volume) {
        Random random = new Random();
        int[] array = new int[volume];
        for (int i = 0; i < volume; i++) {
            array[i] = random.nextInt(0, 100);
        }
        return array;
    }

    public static void printArray(int[] array) {
        for (int j : array) {
            System.out.print(j + " ");
        }
        System.out.println();
    }

    public static double requestEnterNumber(String massage) {
        Scanner scanner = new Scanner(System.in);
        double number;
        while (true) {
            try {
                System.out.println(massage);
                number = Double.parseDouble(scanner.next());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Ошибка ввода! Попробуйте еще раз.");
            }
        }
        return number;
    }

    public static char requestEnterOperation(String massage) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(massage);
        return scanner.next().charAt(0);
    }
}
