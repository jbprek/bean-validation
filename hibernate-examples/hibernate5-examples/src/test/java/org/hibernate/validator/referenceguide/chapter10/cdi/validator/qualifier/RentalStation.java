package org.hibernate.validator.referenceguide.chapter10.cdi.validator.qualifier;

import org.hibernate.validator.cdi.HibernateValidator;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

@ApplicationScoped
public class RentalStation {

    @Inject
    @HibernateValidator
    private ValidatorFactory validatorFactory;

    @Inject
    @HibernateValidator
    private Validator validator;

    //...
}
