package web.dao;

import org.springframework.stereotype.Repository;
import web.models.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class CarDaoImpl implements CarDao {
    private final List<Car> cars;

    {
        cars = new ArrayList<>();
        cars.add(new Car("Chevrolet", "Corvette", "Yellow"));
        cars.add(new Car("Honda", "Accord", "White"));
        cars.add(new Car("DeLorean", "DMC", "Silver"));
        cars.add(new Car("Mercedes-Benz", "CLK-500","Black"));
        cars.add(new Car("Ford", "GT", "Red"));
    }

    @Override
    public List<Car> getCarsDao() {
        return cars;
    }

    @Override
    public List<Car> getCarsDao(int count) {
        return cars.stream().limit(count).collect(Collectors.toList());
    }

}
