package org.hibernate.validator.referenceguide.chapter11.constraintapi;

import org.hibernate.validator.spi.group.DefaultGroupSequenceProvider;

import java.util.List;

public class RentalCarGroupSequenceProvider implements DefaultGroupSequenceProvider<RentalCar> {
    @Override
    public List<Class<?>> getValidationGroups(RentalCar car) {
        return null;
    }
}
