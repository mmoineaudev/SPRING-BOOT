package com.miage.pepito.superpassword.passwordCriteria;

import com.miage.pepito.superpassword.interfaces.IValidationCriteria;

import java.util.regex.Pattern;

public class OneLetterMini implements IValidationCriteria {

    @Override
    public boolean isValid(String password) {
        return Pattern.compile("/.*\\w.*/").matcher(password).matches();
    }
}
