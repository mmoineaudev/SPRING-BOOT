package com.miage.pepito.superpassword.checks;

import com.miage.pepito.superpassword.interfaces.IPasswordValidator;
import com.miage.pepito.superpassword.interfaces.IValidationCriteria;

import java.util.List;

public class PasswordValidator implements IPasswordValidator {

    private List<IValidationCriteria> iValidationCriterion;

    public PasswordValidator(List<IValidationCriteria> iValidationCriterion) {
        this.iValidationCriterion = iValidationCriterion;
    }

    @Override
    public boolean isValidPassword(String password) {
        for (IValidationCriteria iValidationCriteria : iValidationCriterion) {
            if(iValidationCriteria.isValid(password)) {
                return false;
            }
        }

        return true;
    }

}
