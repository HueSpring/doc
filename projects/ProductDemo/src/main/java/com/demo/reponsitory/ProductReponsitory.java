package com.demo.reponsitory;

import com.demo.model.Product;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Hue on 10/22/2016.
 */

public interface ProductReponsitory extends CrudRepository<Product, String> {


}
