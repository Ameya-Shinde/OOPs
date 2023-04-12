package implementations;

import enums.CarType;
import interfaces.IService;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

public class ServiceProvider {

    List<IService> services = new ArrayList<>();
    private CarType carType;

    public ServiceProvider(CarType carType, List<String> services) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        this.carType = carType;
        for(String serviceName : services){
            Class<?> clazz = Class.forName(serviceName);
            Constructor<?> cons =clazz.getConstructor(CarType.class);
            IService service = (IService) cons.newInstance(carType);
            this.services.add(service);
        }
    }

    public float getTotalPrice(){
        float totalPrice=0.0f;
        for(IService service: services){
            totalPrice+=service.getPrice();
        }
        return totalPrice;
    }

    public String Bill(){
        List<String> list=new ArrayList<>();
        for(IService service: services){
            String s="Charges for "+service.getClass().toString().substring(22)+" is "+service.getPrice()+"\n";
            list.add(s);
        }
        if(getTotalPrice()>10000){
            list.add("Done Free Complementary Cleaning");
        }
        return list.toString()+"\n"+"Total Bill : "+getTotalPrice();
    }
}
