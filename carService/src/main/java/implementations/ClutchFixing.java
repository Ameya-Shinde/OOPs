package implementations;

import enums.CarType;
import interfaces.IService;

import java.util.HashMap;
import java.util.Map;

public class ClutchFixing implements IService {

    private CarType carType;

    private Map<CarType,Integer> CarTypePrices=new HashMap<>();
    public ClutchFixing(CarType carType){
        this.carType=carType;
        CarTypePrices.put(CarType.SEDAN,4000);
        CarTypePrices.put(CarType.HATCHBACK,2000);
        CarTypePrices.put(CarType.SUV,6000);
    }

    @Override
    public float getPrice() {
        return CarTypePrices.get(this.carType);
    }
}
