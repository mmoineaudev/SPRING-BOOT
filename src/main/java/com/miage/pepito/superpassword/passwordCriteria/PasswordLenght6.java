package com.miage.pepito.superpassword.passwordCriteria;

import java.util.regex.Pattern;

public class PasswordLenght6 {

    public boolean isLenghtSup6(String password){
        return Pattern.compile("/.{6,}/").matcher(password).matches();
    }
}
