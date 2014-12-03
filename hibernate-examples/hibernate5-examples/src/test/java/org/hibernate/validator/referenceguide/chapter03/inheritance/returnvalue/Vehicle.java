package org.hibernate.validator.referenceguide.chapter03.inheritance.returnvalue;

import javax.validation.constraints.NotNull;
import java.util.List;

public interface Vehicle {

    @NotNull
    List<Person> getPassengers();
}
