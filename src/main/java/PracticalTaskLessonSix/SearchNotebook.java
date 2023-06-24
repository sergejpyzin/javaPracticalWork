package PracticalTaskLessonSix;

import java.util.Collection;
import java.util.List;

public class SearchNotebook {
    private String brand;
    private String color;
    private Integer minRandomAccessMemory;
    private Integer maxRandomAccessMemory;

    public SearchNotebook setBrand(String brand) {
        this.brand = brand;
        return this;
    }
    public SearchNotebook setColor(String color) {
        this.color = color;
        return this;
    }
    public SearchNotebook setMinRandomAccessMemory(Integer minRandomAccessMemory) {
        this.minRandomAccessMemory = minRandomAccessMemory;
        return this;
    }
    public SearchNotebook setMaxRandomAccessMemory(Integer maxRandomAccessMemory) {
        this.maxRandomAccessMemory = maxRandomAccessMemory;
        return this;
    }

    private boolean rangeOf(Integer value, Integer min, Integer max) {
        if (min == null && max == null) {
            return true;
        }
        if (min != null && max == null && min <= value) {
            return true;
        }
        if (max != null && min == null && max >= value) {
            return true;
        }
        if (max != null && min != null && max >= value && min <= value) {
            return true;
        }
        return false;
    }

    public List<Notebook> search (Collection<Notebook> notebooks){

    }
}
