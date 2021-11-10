package com.example.demos.repo;

import com.example.demos.models.Product;
import com.example.demos.models.User;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository <Product, Long>{

}


