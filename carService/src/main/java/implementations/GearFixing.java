package implementations;

import enums.CarType;
import interfaces.IService;

import java.util.HashMap;
import java.util.Map;

public class GearFixing implements IService {

    private CarType carType;

    private Map<CarType,Integer> CarTypePrices=new HashMap<>();
    public GearFixing(CarType carType){
        this.carType=carType;
        CarTypePrices.put(CarType.SEDAN,6000);
        CarTypePrices.put(CarType.HATCHBACK,3000);
        CarTypePrices.put(CarType.SUV,8000);
    }

    @Override
    public float getPrice() {
        return CarTypePrices.get(this.carType);
    }
}
