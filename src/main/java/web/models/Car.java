package web.models;

import org.springframework.stereotype.Component;

@Component
public class Car {
    private String model;
    private String series;
    private String color;

    public Car(String brand, String series, String color) {
        this.model = brand;
        this.series = series;
        this.color = color;
    }

    public Car() {

    }
    @Override
    public String toString() {
        return "Car{" +
                "brand='" + model + '\'' +
                ", model='" + series + '\'' +
                ", color=" + color +
                '}';
    }

    public String getModel() {
        return model;
    }

    public String getSeries() {
        return series;
    }

    public String getColor() {
        return color;
    }
}
