package org.hibernate.validator.referenceguide.chapter03.inheritance.returnvalue;

import javax.validation.constraints.Size;
import java.util.List;

public class Car implements Vehicle {

    @Override
    @Size(min = 1)
    public List<Person> getPassengers() {
        //...
        return null;
    }
}
