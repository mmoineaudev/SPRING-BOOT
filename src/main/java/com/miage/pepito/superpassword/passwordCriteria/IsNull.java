package com.miage.pepito.superpassword.passwordCriteria;

import com.miage.pepito.superpassword.interfaces.IValidationCriteria;

public class IsNull implements IValidationCriteria {

    @Override
    public boolean isValid(String password) {
        return !(password.length() == 0);
    }
}
