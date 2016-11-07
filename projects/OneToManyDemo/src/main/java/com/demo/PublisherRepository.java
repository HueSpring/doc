package com.demo;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by Hue on 10/28/2016.
 */
public interface PublisherRepository extends CrudRepository<Publisher, Integer> {

}
