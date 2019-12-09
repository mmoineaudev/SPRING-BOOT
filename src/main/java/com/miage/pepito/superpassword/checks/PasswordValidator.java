package com.miage.pepito.superpassword.checks;

import com.miage.pepito.superpassword.interfaces.IPasswordValidator;

public class PasswordValidator implements IPasswordValidator {
    @Override
    public boolean isValidPassword(String password) {
        return false;
    }
}
