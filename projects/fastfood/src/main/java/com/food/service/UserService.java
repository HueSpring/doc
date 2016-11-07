package com.food.service;

import com.food.exception.ExceptionForm;
import com.food.model.User;
import com.food.repository.UserReponsitory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.jws.soap.SOAPBinding;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Hue on 10/31/2016.
 */
@Service
public class UserService {

    @Autowired
    private UserReponsitory userReponsitory;

    public User login(String id, String password) {
        if (!exists(id)) {
            throw new ExceptionForm("username", ExceptionForm.ERROR_CODE.EXIST, "username is not exist");
        }
        User user = findOne(id);
        if (!password.equals(user.getPassword())) {
            throw new ExceptionForm("password", ExceptionForm.ERROR_CODE.INCORRECT, "password is not correct");
        }
        return user;
    }

    public Iterable<User> findAll() {
        return userReponsitory.findAll();
    }

    public User findOne(String id) {
        if (!exists(id)) {
            throw new ExceptionForm("username", ExceptionForm.ERROR_CODE.EXIST, "username is not exist");
        }
        return userReponsitory.findOne(id);
    }


    public boolean exists(String id) {
        return userReponsitory.exists(id);
    }


}
