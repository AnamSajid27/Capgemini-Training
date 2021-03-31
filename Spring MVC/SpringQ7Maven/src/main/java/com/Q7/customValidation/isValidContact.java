package com.Q7.customValidation;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Documented
@Constraint(validatedBy = ContactValidator.class)
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface isValidContact {
    String message() default "Please provide a valid contact";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
