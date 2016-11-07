package com.food.repository;

import com.food.model.Salary;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Hue on 10/31/2016.
 */
public interface SalaryRepository extends CrudRepository<Salary, Integer> {
}
