package PracticalTaskLessonOne;

import java.util.Random;

public class taskTwo {
    private static int[][] fillingRandomMatrix() {
        Random random = new Random();
        int row = taskOne.requestEnterInformation("Введите количество строк:");
        int columns = taskOne.requestEnterInformation("Введите количество столбцов:");
        int[][] someMatrix = new int[row][columns];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < columns; j++) {
                if (j == i) someMatrix[i][j] = 1;
                else if (j == columns - i - 1) someMatrix[i][j] = 1;
                else someMatrix[i][j] = random.nextInt(2, 9);
            }
        }
        return someMatrix;
    }
    public static void printMatrix(int [][] someMatrix){
        for (int[] row : someMatrix) {
            for (int columns : row) {
                System.out.printf("%2d ", columns);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] matrix = fillingRandomMatrix();
        printMatrix(matrix);
    }
}
