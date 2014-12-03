package org.hibernate.validator.referenceguide.chapter11.valuehandling;

import org.hibernate.validator.HibernateValidator;
import org.junit.Test;

import javax.validation.Validation;
import javax.validation.Validator;

public class UnwrapValidatedValueTest {

    @Test
    public void failFast() {
        Validator validator = Validation.byProvider(HibernateValidator.class)
                .configure()
                .addValidatedValueHandler(new PropertyValueUnwrapper())
                .buildValidatorFactory()
                .getValidator();
    }
}
