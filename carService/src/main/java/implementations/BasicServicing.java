package implementations;

import enums.CarType;
import interfaces.IService;

import java.util.Map;

public class BasicServicing implements IService {

    private CarType carType;

    public BasicServicing(CarType carType){
        this.carType = carType;
    }

    private static Map<CarType, Integer> carTypePrice;

    static {
        carTypePrice.put(CarType.SEDAN, 4000);
        carTypePrice.put(CarType.HATCHBACK, 2000);
        carTypePrice.put(CarType.SUV, 5000);

    }


    @Override
    public float getPrice() {
        return carTypePrice.get(this.carType);
    }
}
