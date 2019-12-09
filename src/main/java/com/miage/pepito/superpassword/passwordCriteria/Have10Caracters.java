package com.miage.pepito.superpassword.passwordCriteria;

import java.util.regex.Pattern;

public class Have10Caracters {

    public boolean have10CaratersMini(String password) {
        return Pattern.compile("/.{10,}/").matcher(password).matches();

    }
}
