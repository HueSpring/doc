package com.food.controller;

import com.food.exception.ExceptionForm;
import com.food.form.LoginForm;
import com.food.model.User;
import com.food.service.UserService;
import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.jws.soap.SOAPBinding;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

/**
 * Created by Hue on 10/31/2016.
 */
@RestController
@RequestMapping(value = "/emp")
public class UserController {

    @Autowired
    private UserService userService;

    public UserController() {
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public User login(@Valid @RequestBody LoginForm form, BindingResult bindingResult, HttpSession session) {
        if (bindingResult.hasErrors()) {
            throw new ExceptionForm(bindingResult);
        }
        User user = userService.login(form.getId(), form.getPassword());
        session.setAttribute("account", user);
        User u = (User) session.getAttribute("account");
        System.out.print("gggdgdggdgdggdgdg " + u.getId());
        return user;
    }


    @RequestMapping(method = RequestMethod.GET)
    public Iterable<User> findAll() {
        return userService.findAll();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public User findOne(@PathVariable String id) {
        if (!userService.exists(id)) {
            ExceptionForm exceptionForm = new ExceptionForm();

            throw exceptionForm;
        }
        return userService.findOne(id);
    }

}
