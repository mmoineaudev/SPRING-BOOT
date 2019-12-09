package com.miage.pepito.superpassword.passwordCriteria;

import java.util.regex.Pattern;

public class SpecialCaraters {

    public boolean haveOneSpecialCaratersMini(String password) {
        return Pattern.compile("/.*\\W.*/").matcher(password).matches();
    }
}
