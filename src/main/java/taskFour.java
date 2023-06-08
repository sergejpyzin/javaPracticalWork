import java.util.Arrays;

public class taskFour {
    /*Написать метод, которому на вход подается одномерный массив и число n (может быть положительным, или отрицательным),
    при этом метод должен сместить все элементы массива на n позиций. Элементы смещаются циклично.
    Для усложнения задачи нельзя пользоваться вспомогательными массивами.
    Примеры: [ 1, 2, 3 ] при n = 1 (на один вправо) -> [ 3, 1, 2 ];
    [ 3, 5, 6, 1] при n = -2 (на два влево) -> [ 6, 1, 3, 5 ]. При каком n в какую сторону сдвиг можете выбирать сами.*/

    public static void shiftingArrayElement(int[]someArray, int number) {
        int temp;
        if (number > 0) {
            for (int i = 0; i < number; i++) {
                temp = someArray[someArray.length - 1];
                for (int j = 1; j < someArray.length; j++) {
                    someArray[someArray.length - j] = someArray[someArray.length - 1 - j];
                }
                someArray[0] = temp;
            }
        }
        else if (number < 0) {
            for (int i = 0; i < Math.abs(number); i++) {
                temp = someArray[0];
                for (int j = 0; j < someArray.length - 1; j++) {
                    someArray[j] = someArray[j + 1];
                }
                someArray[someArray.length - 1] = temp;
            }
        }
    }

    public static void main(String[] args) {
        int[] array =  taskOne.fillingArray();
        int n = taskOne.requestEnterInformation("Введите значение сдвига: ");
        System.out.println(Arrays.toString(array));
        shiftingArrayElement(array, n);
        System.out.println(Arrays.toString(array));
    }
}
