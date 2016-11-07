package com.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * Created by Hue on 11/2/2016.
 */
@RestController
public class PublisherController {

    @Autowired
    PublisherRepository publisherRepository;

    @RequestMapping(value = "/pu")
    public Iterable<Publisher> findAll(){
        return publisherRepository.findAll();
    }


}
