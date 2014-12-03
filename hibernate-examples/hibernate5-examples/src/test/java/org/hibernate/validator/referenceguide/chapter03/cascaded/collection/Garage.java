package org.hibernate.validator.referenceguide.chapter03.cascaded.collection;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;

public class Garage {

    public boolean checkCars(@Valid @NotNull List<Car> cars) {
        //...
        return false;
    }
}
