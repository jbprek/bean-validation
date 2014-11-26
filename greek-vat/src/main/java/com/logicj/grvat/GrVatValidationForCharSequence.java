package com.logicj.grvat;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 * Created by john@logicj.com on 26/2/2014.
 */
public class GrVatValidationForCharSequence implements ConstraintValidator<GrVat, CharSequence> {

    @Override
    public void initialize(GrVat constraintAnnotation) {
    }

    @Override
    public boolean isValid(CharSequence value, ConstraintValidatorContext context) {
        if ( value == null)
            return true;
        long numValue;
        try {
            numValue = Long.parseLong(value.toString());
        } catch (NumberFormatException e) {
            return false;
        }
        return GrVatValidationForNumber.validate(numValue);
    }



}

