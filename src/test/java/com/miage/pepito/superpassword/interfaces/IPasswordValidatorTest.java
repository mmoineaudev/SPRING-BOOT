package com.miage.pepito.superpassword.interfaces;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class IPasswordValidatorTest {
    IPasswordValidator passwordValidator;
    List<IValidationCriteria> adminCriteria;
    List<IValidationCriteria> userCriteria;
    IUserManager userManager;

    @Test
    public void testValidation(){
        userManager.addUser();
        assertTrue(true);
    }
}