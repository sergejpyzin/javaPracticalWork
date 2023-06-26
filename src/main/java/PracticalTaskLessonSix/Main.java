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
        List<Notebook> findByBrand = find.searchNotebookByBrand(notebooks, "Intel");
        List<Notebook> findByColor = find.searchNotebookByColor(notebooks, "Steel");
        List<Notebook> findByRam = find.searchNotebookByRAM(notebooks, 8);

        System.out.println(findByBrand);
        System.out.println(findByColor);
        System.out.println(findByRam);

    }
}
