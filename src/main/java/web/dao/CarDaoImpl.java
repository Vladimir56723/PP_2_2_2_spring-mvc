package web.dao;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
@Component
public class CarDaoImpl implements CarDao{
    private static int COUNT;
    private  final List<Car> cars;

    {
        cars = new ArrayList<>();
        cars.add(new Car(++COUNT, "BMW", "Black"));
        cars.add(new Car(++COUNT, "AUDI", "Red"));
        cars.add(new Car(++COUNT, "MERCEDES", "Blue"));
        cars.add(new Car(++COUNT, "TOYOTA", "White"));
        cars.add(new Car(++COUNT, "LADA", "Grey"));
    }


    @Override
    public List<Car> index(int count) {

        if (count >= cars.size()) {
            return cars;
        } else if(count<5&&count>0){
            List<Car> cars1 = new ArrayList<>();
            for (int i = 0; i < cars.size(); i++) {
                if (i <= count-1) {
                    cars1.add(cars.get(i));
                }
            }
            return cars1;
        }else {
            return cars;
        }
    }
}
