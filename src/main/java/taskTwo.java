import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class taskTwo {
    private static int[][] fillingTwoDimensionalArray(){
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.print("Введите количество строк: ");
        int row = scanner.nextInt();
        System.out.print("Введите количество столбцов: ");
        int columns = scanner.nextInt();
        int[][] someArray = new int[row][columns];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < columns; j++) {
                if (j == i) someArray[i][j] = 1;
                else if (j == columns - i - 1) someArray[i][j] = 1;
                else someArray[i][j] = random.nextInt(3, 10);
            }
        }
        return someArray;

    }
    public static void main(String[] args) {
        int[][] array = fillingTwoDimensionalArray();
        System.out.println(Arrays.deepToString(array));
    }
}
