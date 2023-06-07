import java.util.Scanner;

public class taskOne {
    //    1. Задать одномерный массив и найти в нем минимальный и максимальный элементы ;
    public static int[] fillingArray() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество элементов массива: ");
        int quantityElement = scanner.nextInt();
        int[] someArray = new int[quantityElement];
        for (int i = 0; i < someArray.length; i++) {
            System.out.print("Введите елемент массива: ");
            someArray[i] = scanner.nextInt();
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
        System.out.println("min = " + min);
        System.out.println("max = " + max);
    }
}
