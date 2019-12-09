package com.miage.pepito.superpassword.passwordCriteria;

import java.util.regex.Pattern;

public class OneLetterMini {

    public boolean haveOneLetterMini(String password){
        return Pattern.compile("/.*\\w.*/").matcher(password).matches();
    }
}
