package PracticalTaskLessonSix;

import java.util.*;
import java.util.stream.Collectors;

public class Notebook {
    private String brand;
    private String color;
    private int randomAccessMemory;

    public Notebook(String brand, String color, int randomAccessMemory) {
        this.brand = brand;
        this.color = color;
        this.randomAccessMemory = randomAccessMemory;
    }


    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getRandomAccessMemory() {
        return randomAccessMemory;
    }

    public void setRandomAccessMemory(int randomAccessMemory) {
        this.randomAccessMemory = randomAccessMemory;
    }

    @Override
    public String toString() {
        return "Notebook{" +
                "brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                ", randomAccessMemory=" + randomAccessMemory +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Notebook notebook = (Notebook) o;
        return randomAccessMemory == notebook.randomAccessMemory && brand.equals(notebook.brand)
                && color.equals(notebook.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, color, randomAccessMemory);
    }

}