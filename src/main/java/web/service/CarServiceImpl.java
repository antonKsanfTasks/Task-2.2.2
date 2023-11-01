package web.service;

import web.dao.CarDaoImpl;
import web.models.Car;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class CarServiceImpl implements CarService {

    private final CarDaoImpl carDao;

    private CarServiceImpl(CarDaoImpl carDao) {
        this.carDao = carDao;
    }

    @Override
    public List<Car> getCars(int number) {
        return carDao.getCarsDao(number);
    }

    @Override
    public List<Car> getCars() {
        return carDao.getCarsDao();
    }
}
