import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class test {
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

    public static double averageValue(List<Integer> someList){
        double sum = 0;
        for (Integer integer : someList) {
            sum += integer;
        }
        System.out.println(sum);
        System.out.println(someList.size());
        return sum / someList.size();
    }

    public static void main(String[] args) {
        Random random = new Random();

        List<Integer> someList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            someList.add(random.nextInt(10));
        }


        IntSummaryStatistics stats = someList.stream().collect(Collectors.summarizingInt(Integer::intValue));
        System.out.println(someList);
        System.out.println(averageValue(someList));
        System.out.println(someList.stream().max(Comparator.naturalOrder()).get());
        System.out.println(someList.stream().min(Comparator.naturalOrder()).get());
        removeEvenElements(someList);
        System.out.println(someList);



    }
}

