package PracticalTaskLessonThird;

import java.util.*;
import java.util.stream.Collectors;

public class task {

    public static double averageValue(List<Integer> someList){
        IntSummaryStatistics summary = someList.stream().collect(Collectors.summarizingInt(Integer::intValue));
        return summary.getAverage();
    }

    public static void removeEvenElements(List<Integer> someList){
        int index = 0;
        while (index < someList.size()){
            if (someList.get(index) % 2 == 0){
                someList.remove(index);
            } else {
                index++;
            }
        }
    }

    public static List<Integer> randomList (int size, int leftBorder, int rightBorder){
        Random random = new Random();
        List<Integer> someList = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            someList.add(random.nextInt(leftBorder, rightBorder + 1));
        }
        return someList;
    }

    public static void main(String[] args) {
        int size = library.requestIntegerEnterNumber("Введите размер списка: ");
        int minValue = library.requestIntegerEnterNumber("Введите минимальное значение диапазона " +
                "случайных чисел:");
        int maxValue = library.requestIntegerEnterNumber("Введите максимальное значение диапазона " +
                "случайных чисел:");
        List<Integer> list = randomList(size, minValue, maxValue);

        System.out.println(list);
        double average = averageValue(list);
        System.out.println("Среднеарифметическое значение: " + average);
        System.out.println("Максимальное значение списка: " + list.stream().max(Comparator.naturalOrder()).get());
        System.out.println("Минимальное значение списка: " + list.stream().min(Comparator.naturalOrder()).get());
        removeEvenElements(list);
        System.out.println(list);

    }
}
