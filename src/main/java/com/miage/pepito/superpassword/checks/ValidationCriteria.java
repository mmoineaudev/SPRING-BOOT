package com.miage.pepito.superpassword.checks;

import com.miage.pepito.superpassword.interfaces.IValidationCriteria;

public class ValidationCriteria implements IValidationCriteria {

    public boolean isValid(String password){
        if (password.length() > 6){
            return true;
        }
        return false;
    }

}
