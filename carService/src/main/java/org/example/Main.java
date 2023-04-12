package org.example;

import enums.CarType;
import implementations.ServiceProvider;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String args[]) throws ClassNotFoundException, InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {

        List<String> services = new ArrayList<>();
        services.add("implementations.BrakeFixing");
        services.add("implementations.EngineFixing");
        services.add("implementations.ClutchFixing");

        ServiceProvider serviceProvider = new ServiceProvider(CarType.SEDAN, services);
        System.out.println(serviceProvider.Bill());

    }
}
