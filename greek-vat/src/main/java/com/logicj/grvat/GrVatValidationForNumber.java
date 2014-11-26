package com.logicj.grvat;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 * Created by john@logicj.com on 26/2/2014.
 */
public class GrVatValidationForNumber implements ConstraintValidator<GrVat, Number> {
    private static final int VALID_DIV = 11;

    private static final int[] p = {256, 128, 64, 32, 16, 8, 4, 2, 0};

    private static final int[] pow10rev = {100000000, 10000000, 1000000, 100000, 10000, 1000, 100, 10};

    @Override
    public void initialize(GrVat constraintAnnotation) {
    }

    @Override
    public boolean isValid(Number value, ConstraintValidatorContext context) {
        return validate(value.longValue());
    }

    public static boolean validate(long vatNumber) {

        long mod = vatNumber;
        int sum = 0;
        for (int i = 0; i < 8; i++) {
            long digit = mod / pow10rev[i];
            sum +=digit*p[i];
            mod = mod % pow10rev[i];
        }
        long chk = sum % VALID_DIV;
        chk = (chk == 10 ? 1 : chk);

        return (mod == chk);
    }

}

