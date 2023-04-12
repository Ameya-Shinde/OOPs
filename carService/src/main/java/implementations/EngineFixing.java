package implementations;

import enums.CarType;
import interfaces.IService;

import java.util.HashMap;
import java.util.Map;

public class EngineFixing implements IService {

    private CarType carType;

    private Map<CarType,Integer> CarTypePrices=new HashMap<>();
    public EngineFixing(CarType carType){
        this.carType=carType;
        CarTypePrices.put(CarType.SEDAN,8000);
        CarTypePrices.put(CarType.HATCHBACK,5000);
        CarTypePrices.put(CarType.SUV,10000);
    }

    @Override
    public float getPrice() {
        return CarTypePrices.get(this.carType);
    }
}
