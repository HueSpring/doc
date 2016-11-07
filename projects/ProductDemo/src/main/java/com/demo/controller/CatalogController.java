package com.demo.controller;

import com.demo.model.Catalog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.demo.reponsitory.CatalogReponsitory;

/**
 * Created by Hue on 10/22/2016.
 */
@RestController
@RequestMapping(value = "catalog")
public class CatalogController {

    @Autowired
    CatalogReponsitory reponsitory;

    //count
    @RequestMapping(value = "/count", method = RequestMethod.GET)
    public long count() {
        return reponsitory.count();
    }

    //findAll
    @RequestMapping(method = RequestMethod.GET)
    public Iterable<Catalog> findAll() {
        return reponsitory.findAll();
    }

    //findOne
    @RequestMapping(value = "{id}", method = RequestMethod.GET)
    public Catalog findOne(@PathVariable(value = "id") String id){
        return reponsitory.findOne(id);
    }

    //delete
    @RequestMapping(value = "{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable(value = "id") String id){
        reponsitory.delete(id);
    }
}
