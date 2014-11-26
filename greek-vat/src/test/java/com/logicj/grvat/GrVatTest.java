package com.logicj.grvat;

import org.junit.BeforeClass;
import org.junit.Test;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import java.math.BigInteger;
import java.util.Set;

import static org.junit.Assert.assertEquals;

/**
 * Sample class that demonstrates GrValidation on
 * @author prekezes.
 */
public class GrVatTest {

    public static class Example {
        @GrVat
        private long intVat;

        @GrVat
        private long longVat;

        @GrVat
        private BigInteger bgVat;

        @GrVat
        private String stringVat;

        public Example(int vat, String stringVat) {
            this.intVat = vat;
            this.longVat = vat;
            this.bgVat =  BigInteger.valueOf(vat);
            this.stringVat = stringVat;
        }

    }

    private static Validator validator;

    @BeforeClass
    public static void setUp() {
        ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
        validator = factory.getValidator();
    }



    @Test
    public void test() {
        Example valid = new Example(44130873, "044130873");

        Set<ConstraintViolation<Example>> constraintViolations =
                validator.validate(valid);

        assertEquals(0, constraintViolations.size());

        Example invalid = new Example(2, "044130872");
        constraintViolations =
                validator.validate(invalid);
        assertEquals(4, constraintViolations.size());



        ConstraintViolation<Example> violation = constraintViolations.iterator().next();
        System.out.println("getMessage()="+violation.getMessage());
        System.out.println("getMessageTemplate()="+violation.getMessageTemplate());
        System.out.println("getConstraintDescriptor()="+violation.getConstraintDescriptor());
        System.out.println("getInvalidValue()="+violation.getInvalidValue());
        System.out.println("getPropertyPath()="+violation.getPropertyPath());
        System.out.println("getRootBean()="+violation.getRootBean());
        System.out.println("getLeafBean()="+violation.getLeafBean());
    }
}
