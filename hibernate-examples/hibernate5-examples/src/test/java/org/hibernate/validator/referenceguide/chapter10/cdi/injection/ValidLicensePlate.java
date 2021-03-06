package org.hibernate.validator.referenceguide.chapter10.cdi.injection;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Target({FIELD, METHOD, PARAMETER, ANNOTATION_TYPE})
@Retention(RUNTIME)
@Constraint(validatedBy = ValidLicensePlateValidator.class)
@Documented
public @interface ValidLicensePlate {

    String message() default "{org.hibernate.validator.referenceguide.chapter10.injection.ValidLicensePlate.message}";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};

    @Target({FIELD, METHOD, PARAMETER, ANNOTATION_TYPE})
    @Retention(RUNTIME)
    @Documented
    @interface List {
        ValidLicensePlate[] value();
    }
}
