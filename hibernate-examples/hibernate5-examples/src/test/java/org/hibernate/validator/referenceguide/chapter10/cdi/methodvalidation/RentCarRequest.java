package org.hibernate.validator.referenceguide.chapter10.cdi.methodvalidation;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import java.util.Date;

@RequestScoped
public class RentCarRequest {

    @Inject
    private RentalStation rentalStation;

    public void rentCar(String customerId, Date startDate, int duration) {
        //causes ConstraintViolationException
        rentalStation.rentCar(null, null, -1);
    }
}
