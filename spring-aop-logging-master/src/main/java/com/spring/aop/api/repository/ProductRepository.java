package com.spring.aop.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.aop.api.model.Product;

public interface ProductRepository extends JpaRepository<Product,Integer>{

}
