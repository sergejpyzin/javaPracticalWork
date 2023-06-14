package PracticalTaskLessonTwo;

import java.io.BufferedReader;
import java.io.FileReader;
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

    public static void printStringArray(String[] array){
        for (String j : array) {
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

    public static String[] readFile(String fileName) throws Exception {
        BufferedReader readerBuffer = new BufferedReader(new FileReader(fileName));
        int sizeArray = 0;
        int iteration = 0;
        while ((readerBuffer.readLine()) != null) {
            sizeArray += 1;
        }
        readerBuffer.close();
        String[] stringsArray = new String[sizeArray];
        BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName));
        String string;
        while ((string = bufferedReader.readLine()) != null) {
            stringsArray[iteration] = string;
            iteration += 1;
        }
        bufferedReader.close();
        return stringsArray;
    }
}
