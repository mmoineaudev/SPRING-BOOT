package com.miage.pepito.superpassword.interfaces;

import com.miage.pepito.superpassword.passwordCriteria.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IValidationCriteriaTest {
    private IValidationCriteria first = new HaveTenCharacters(),
    second = new OneLetterMini(),
    third = new PasswordLengthEqualsSix(),
    forth = new PasswordWithOneNumber(),
    fifth = new SpecialCharacters(),
    sixiemeJeSaisPasLeDireEnAnglais = new IsNull();
    @Test
    void isValid() {
        String lessThanSix = "12aB5";
        String moreThanSix = "12aB5678";
        String moreThanTen = "1aB45aB3456";
        String specChars = "ABCDE!&$ea1";

        assertTrue(! first.isValid(lessThanSix));
        assertTrue(! first.isValid(moreThanSix));
        assertTrue(first.isValid(moreThanTen));
        assertTrue(first.isValid(specChars));


        assertTrue(second.isValid(lessThanSix));
        assertTrue(second.isValid(moreThanSix));
        assertTrue(second.isValid(moreThanTen));
        assertTrue(second.isValid(specChars));


        assertTrue(! third.isValid(lessThanSix));
        assertTrue(third.isValid(moreThanSix));
        assertTrue(third.isValid(moreThanTen));
        assertTrue(third.isValid(specChars));

        assertTrue(forth.isValid(lessThanSix));
        assertTrue(forth.isValid(moreThanSix));
        assertTrue(forth.isValid(moreThanTen));
        assertTrue(forth.isValid(specChars));


        assertTrue(! fifth.isValid(lessThanSix));
        assertTrue(! fifth.isValid(moreThanSix));
        assertTrue(! fifth.isValid(moreThanTen));
        assertTrue(fifth.isValid(specChars));

        assertTrue(sixiemeJeSaisPasLeDireEnAnglais.isValid(lessThanSix));
        assertTrue(sixiemeJeSaisPasLeDireEnAnglais.isValid(moreThanSix));
        assertTrue(sixiemeJeSaisPasLeDireEnAnglais.isValid(moreThanTen));
        assertTrue(sixiemeJeSaisPasLeDireEnAnglais.isValid(specChars));
        assertTrue(! sixiemeJeSaisPasLeDireEnAnglais.isValid(""));
        assertTrue(! sixiemeJeSaisPasLeDireEnAnglais.isValid(null));

    }
}