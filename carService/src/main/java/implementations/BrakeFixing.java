package implementations;

import enums.CarType;
import interfaces.IService;

import java.util.HashMap;
import java.util.Map;

public class BrakeFixing implements IService {

    private CarType carType;

    public BrakeFixing(CarType carType){
        this.carType = carType;
    }

    private static Map<CarType, Integer> carTypePrice = new HashMap<>();

    static {
        carTypePrice.put(CarType.SEDAN, 1500);
        carTypePrice.put(CarType.HATCHBACK, 1000);
        carTypePrice.put(CarType.SUV, 2500);

    }

    @Override
    public float getPrice() {
        return carTypePrice.get(this.carType);
    }
}
