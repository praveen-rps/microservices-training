package com.jpa.pagesort.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jpa.pagesort.entity.Product;

public interface ProductRepository extends JpaRepository<Product,Integer> {
}
