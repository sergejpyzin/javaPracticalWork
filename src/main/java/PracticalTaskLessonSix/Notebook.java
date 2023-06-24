package PracticalTaskLessonSix;

import java.util.Objects;

public class Notebook {
    private String brand;
    private String color;
    private String processor;
    private double processorFrequency;
    private int randomAccessMemory;

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

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public double getProcessorFrequency() {
        return processorFrequency;
    }

    public void setProcessorFrequency(double processorFrequency) {
        this.processorFrequency = processorFrequency;
    }

    public int getRandomAccessMemory() {
        return randomAccessMemory;
    }

    public void setRandomAccessMemory(int randomAccessMemory) {
        this.randomAccessMemory = randomAccessMemory;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Notebook notebook = (Notebook) o;
        return Double.compare(notebook.processorFrequency, processorFrequency) == 0
                && randomAccessMemory == notebook.randomAccessMemory
                && brand.equals(notebook.brand) && color.equals(notebook.color) && processor.equals(notebook.processor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, color, processor, processorFrequency, randomAccessMemory);
    }

    public Notebook(String brand, String color, String processor, double processorFrequency, int randomAccessMemory) {
        this.brand = brand;
        this.color = color;
        this.processor = processor;
        this.processorFrequency = processorFrequency;
        this.randomAccessMemory = randomAccessMemory;
    }
}
