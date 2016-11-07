package com.demo.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.servlet.annotation.ServletSecurity;
import java.util.List;
import java.util.logging.FileHandler;

/**
 * Created by Hue on 10/24/2016.
 */
@ControllerAdvice
public class ExceptionController {


    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(ExceptionForm.class)
    @ResponseBody
    public List<ExceptionForm.Error> exceptions(ExceptionForm e){
        return e.getErrors();
    }



}
