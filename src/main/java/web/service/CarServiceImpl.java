package web.service;

import org.springframework.stereotype.Component;
import web.dao.CarDao;
import web.dao.CarDaoImpl;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
@Component
public class CarServiceImpl implements CarService {

    CarDao carDao = new CarDaoImpl();

    @Override
    public List<Car> index(int count) {
        return carDao.index(count);
    }
}