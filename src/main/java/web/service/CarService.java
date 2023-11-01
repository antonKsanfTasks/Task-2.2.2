package web.service;

import web.models.Car;
import org.springframework.stereotype.Component;

import java.util.List;

public interface CarService {

    List<Car> getCars();

    List<Car> getCars(int count);
}