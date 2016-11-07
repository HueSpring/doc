package com.demo.controller;

import com.demo.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.demo.reponsitory.ProductReponsitory;

/**
 * Created by Hue on 10/22/2016.
 */
@RestController
@RequestMapping(value = "/product")
public class ProductController {

    @Autowired
    ProductReponsitory reponsitory;

    //findAll
    @RequestMapping(method = RequestMethod.GET)
    public Iterable<Product> findAll(){
        return reponsitory.findAll();
    }

    //findByCataId


    //findOne
    @RequestMapping(value = "{id}", method = RequestMethod.GET)
    public Product findOne(@PathVariable(value = "id") String id){
        return reponsitory.findOne(id);
    }

    //delete
    @RequestMapping(value = "{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable(value = "id") String id){
        reponsitory.delete(id);
    }

}
