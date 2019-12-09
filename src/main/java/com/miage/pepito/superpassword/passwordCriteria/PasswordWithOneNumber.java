package com.miage.pepito.superpassword.passwordCriteria;

import com.miage.pepito.superpassword.interfaces.IValidationCriteria;

import java.util.regex.Pattern;

public class PasswordWithOneNumber implements IValidationCriteria {

    @Override
    public boolean isValid(String password) {
        return Pattern.compile("/\\d+/").matcher(password).matches();
    }
}
