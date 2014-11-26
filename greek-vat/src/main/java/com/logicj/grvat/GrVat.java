package com.logicj.grvat;


import javax.validation.Constraint;
import javax.validation.Payload;
import javax.validation.constraints.Digits;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Target( { METHOD, FIELD, ANNOTATION_TYPE })
@Retention(RUNTIME)
@Digits(integer=9, fraction=0)
@Constraint(validatedBy = {GrVatValidationForNumber.class, GrVatValidationForCharSequence.class})
@Documented

/**
 * @author prekezes.
 */
public @interface GrVat {

    String message() default "{com.logicj.grvat.validate}";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};

}
