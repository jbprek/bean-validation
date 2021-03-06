package org.hibernate.validator.referenceguide.chapter06.constraintcomposition;

import javax.validation.Constraint;
import javax.validation.Payload;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@NotNull
@Size(min = 2, max = 14)
@CheckCase(CaseMode.UPPER)
@Target({METHOD, FIELD, ANNOTATION_TYPE})
@Retention(RUNTIME)
@Constraint(validatedBy = {})
@Documented
public @interface ValidLicensePlate {

    String message() default "{org.hibernate.validator.referenceguide.chapter06." +
            "constraintcomposition.ValidLicensePlate.message}";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
