package com.miage.pepito.superpassword.passwordCriteria;

import java.util.regex.Pattern;

public class PasswordWithOneNumber {

    public boolean haveOneNumber(String password){
        return Pattern.compile("/\\d+/").matcher(password).matches();

    }
}
