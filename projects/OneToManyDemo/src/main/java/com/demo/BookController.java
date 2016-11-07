package com.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Hue on 11/2/2016.
 */
@RestController
public class BookController{

    @Autowired
    BookReponsitory bookReponsitory;

    @RequestMapping(value = "/")
    public Iterable<Book> findAll(){
//        String s = null;
//        for (Book book: bookReponsitory.findAll()) {
//            s +=book.toString();
//        }
//        return s;
        return bookReponsitory.findAll();
    }


}
