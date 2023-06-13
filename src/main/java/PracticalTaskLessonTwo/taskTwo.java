package PracticalTaskLessonTwo;

import java.util.Arrays;
import java.util.Random;
import java.util.logging.*;

//Реализуйте алгоритм сортировки пузырьком числового массива, результат после каждой итерации запишите в лог-файл.
public class taskTwo {

    public static void main(String[] args) throws Exception {
        Logger LOGGER = Logger.getLogger(taskTwo.class.getName());
        LOGGER.setLevel(Level.INFO);
        FileHandler fh = new FileHandler("log.txt");
        LOGGER.addHandler(fh);
        SimpleFormatter sf = new SimpleFormatter();
        fh.setFormatter(sf);

        int[] array = library.fillingRandomArray(6);
        library.printArray(array);
        boolean sort;
        int i = 0;
        do {
            sort = false;
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    LOGGER.info("Поиск выполнен");
                    sort = true;
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    LOGGER.info("Замена выполнена успешно");
                }
            }
            i++;
        } while (sort);
        library.printArray(array);
    }
}
