package com.virtualpairprogrammers.thymeleafform;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

public class AddUserModelValidator implements Validator {
    @Override
    public boolean supports(Class<?> clazz) {
        return AddUserModel.class.equals(clazz);
    }

    @Override
    public void validate(Object user, Errors errors) {
        AddUserModel addUserModel = (AddUserModel) user;
        if (!addUserModel.getPassword().equals(addUserModel.getRepeatPassword())){
            errors.rejectValue("repeatPassword", "PasswordDontMatch");
        }
    }
}
