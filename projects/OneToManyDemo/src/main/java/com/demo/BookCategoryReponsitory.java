package com.demo;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by Hue on 10/28/2016.
 */
public interface BookCategoryReponsitory extends CrudRepository<BookCategory, Integer>{

    @Transactional
    @Query("SELECT bc from BookCategory bc join bc.books b WHERE b.id = ?1")
    public BookCategory findB(int id);
}
