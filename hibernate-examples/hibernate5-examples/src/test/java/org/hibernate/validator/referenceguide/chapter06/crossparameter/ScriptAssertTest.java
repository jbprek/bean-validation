package org.hibernate.validator.referenceguide.chapter06.crossparameter;

import javax.validation.ConstraintTarget;
import java.util.List;

public class ScriptAssertTest {

    @ScriptAssert(script = "arg1.size() <= arg0", validationAppliesTo = ConstraintTarget.PARAMETERS)
    public Car buildCar(int seatCount, List<Passenger> passengers) {
        //...
        return null;
    }

    private static class Car {
    }

    private static class Passenger {
    }
}
