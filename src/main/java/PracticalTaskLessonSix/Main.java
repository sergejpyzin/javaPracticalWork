package PracticalTaskLessonSix;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Notebook> notebooks = new ArrayList<>();

        notebooks.add(new Notebook("Intel", "Red", 16));
        notebooks.add(new Notebook("Athlon", "Grey", 8));
        notebooks.add(new Notebook("Dell", "Steel", 32));

        System.out.println(notebooks);

        SearchNotebook find = new SearchNotebook();
        List<Notebook> findNotebooks = find.search(notebooks);
        System.out.println(findNotebooks);



    }
}
