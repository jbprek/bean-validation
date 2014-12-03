package org.hibernate.validator.referenceguide.chapter07;

import org.hibernate.validator.referenceguide.chapter03.crossparameter.constrainttarget.Car;

import java.util.List;

public class Garage {

    public Car buildCar(List<Part> parts) {
        //...
        return null;
    }

    public Car paintCar(int color) {
        //...
        return null;
    }
}
