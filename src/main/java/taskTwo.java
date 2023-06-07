import java.util.Random;
import java.util.Scanner;

public class taskTwo {
    private static int[][] fillingMatrix() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.print("Введите количество строк: ");
        int row = scanner.nextInt();
        System.out.print("Введите количество столбцов: ");
        int columns = scanner.nextInt();
        int[][] someMatrix = new int[row][columns];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < columns; j++) {
                if (j == i) someMatrix[i][j] = 1;
                else if (j == columns - i - 1) someMatrix[i][j] = 1;
                else someMatrix[i][j] = random.nextInt(3, 10);
            }
        }
        return someMatrix;

    }

    public static void printMatrix(int [][] someMatrix){
        for (int[] row : someMatrix) {
            for (int columns : row) {
                System.out.print(columns + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] matrix = fillingMatrix();
        printMatrix(matrix);
    }
}
