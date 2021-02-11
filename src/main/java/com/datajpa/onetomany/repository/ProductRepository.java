package com.datajpa.onetomany.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.datajpa.onetomany.domain.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

}
