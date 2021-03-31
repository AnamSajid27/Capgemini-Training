package com.Q7.customValidation;

import com.Q7.customValidation.isValidContact;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;


public class ContactValidator implements ConstraintValidator<isValidContact,String> {

    @Override
    public void initialize(isValidContact constraintAnnotation) {

    }

    @Override
    public boolean isValid(String contact, ConstraintValidatorContext context) {
        if(contact.length()==10 && contact.matches("[0-9]+"))
            return true;
        return false;
    }
}
