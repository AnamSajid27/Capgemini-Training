package com.Q7.customValidation;


import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Documented
@Constraint(validatedBy = ZipcodeValidator.class)
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface isZipcodeValid {



    String message() default "Please enter a Valid zip Code";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};

}
