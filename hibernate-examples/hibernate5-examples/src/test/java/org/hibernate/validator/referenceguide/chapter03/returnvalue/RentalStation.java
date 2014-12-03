package org.hibernate.validator.referenceguide.chapter03.returnvalue;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.List;

public class RentalStation {

    @ValidRentalStation
    public RentalStation() {
        //...
    }

    @NotNull
    @Size(min = 1)
    public List<Customer> getCustomers() {
        //...
        return null;
    }
}
