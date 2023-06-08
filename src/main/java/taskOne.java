import java.util.Scanner;

public class taskOne {
    //    1. Задать одномерный массив и найти в нем минимальный и максимальный элементы ;
    public static int requestEnterInformation (String userMessage){
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

    public static int[] fillingArray() {
        int[] someArray = new int[requestEnterInformation("Введите количество элементов массива:")];

        for (int i = 0; i < someArray.length; i++) {
            someArray[i] = requestEnterInformation("Введите " + (i+1) + " элемент массива:");
        }
        return someArray;
    }

    public static void main(String[] args) {
        int[] array = fillingArray();
        int min = array[0];
        int max = array[0];

        for (int i : array) {
            if (i > max) {
                max = i;
            } else if (i < min) {
                min = i;
            }
        }

        System.out.println("Минимальный элемент массива " + min);
        System.out.println("Максимальный элемент массива " + max);
    }
}
