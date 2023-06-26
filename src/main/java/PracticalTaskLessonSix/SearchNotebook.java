package PracticalTaskLessonSix;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SearchNotebook {

    public List<Notebook> searchNotebookByBrand(List<Notebook> notebooks, String brand){
        List<Notebook> result = new ArrayList<>();
        for (Notebook elem: notebooks) {
            if (elem.getBrand().equals(brand)){
                result.add(elem);
            }
        }
        return result;
    }

    public List<Notebook> searchNotebookByColor(List<Notebook> notebooks, String color){
        List<Notebook> result = new ArrayList<>();
        for (Notebook elem: notebooks) {
            if (elem.getColor().equals(color)){
                result.add(elem);
            }
        }
        return result;
    }
    public List<Notebook> searchNotebookByRAM(List<Notebook> notebooks, int randomAccessMemory){
        List<Notebook> result = new ArrayList<>();
        for (Notebook elem: notebooks) {
            if (elem.getRandomAccessMemory() == randomAccessMemory){
                result.add(elem);
            }
        }
        return result;
    }
    public static String userRequest (String massage){
        Scanner scanner = new Scanner(System.in);
        System.out.println(massage);
        return scanner.next();
    }

    public List<Notebook> search(List<Notebook> notebooks){
        String request = userRequest("""
                Выберите вариант поиска:
                Brand - поиск по фирме производителю;
                Color - поиск по цвету;
                RAM - поиск по размеру оперативной памяти""");
        if (request.equalsIgnoreCase("brand")){
            List<Notebook> result = new ArrayList<>();
            String brand = userRequest("Введите фирму производителя: ");
            for (Notebook elem: notebooks) {
                if (elem.getBrand().equals(brand)){
                    result.add(elem);
                }
            }
            return result;
        } else {
            return System.out.println("");
        }
    }

}
