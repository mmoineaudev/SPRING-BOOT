package com.miage.pepito.superpassword.passwordCriteria;

import com.miage.pepito.superpassword.interfaces.IValidationCriteria;

import java.util.regex.Pattern;

public class SpecialCharacters implements IValidationCriteria {

    @Override
    public boolean isValid(String password) {
        return Pattern.compile("/.*\\W.*/").matcher(password).matches();
    }
}
