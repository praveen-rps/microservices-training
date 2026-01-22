package com.cts.jpa.pagesort.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cts.jpa.pagesort.entity.Product;

public interface ProductRepository extends JpaRepository<Product,Integer> {
}
