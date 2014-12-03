package org.hibernate.validator.referenceguide.chapter03.crossparameter.constrainttarget;

import javax.validation.ConstraintTarget;
import java.util.List;

public class Garage {

    @ELAssert(expression = "...", validationAppliesTo = ConstraintTarget.PARAMETERS)
    public Car buildCar(List<Part> parts) {
        //...
        return null;
    }

    @ELAssert(expression = "...", validationAppliesTo = ConstraintTarget.RETURN_VALUE)
    public Car paintCar(int color) {
        //...
        return null;
    }
}
