package com.virtualpairprogrammers.thymeleafform;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {

    @RequestMapping("/addUser")
    public ModelAndView addUser() {
        return new ModelAndView("newUser", "addUserModel", new AddUserModel());
    }

    @RequestMapping(value = "/saveUser", method = RequestMethod.POST)
    public String saveUser(@Validated AddUserModel addUserModel, BindingResult bindingResult){
        new AddUserModelValidator().validate(addUserModel, bindingResult);
        if (bindingResult.hasErrors()){
            return "newUser";
        }
        return "userAdded";
    }
}

