package com.locatellilucas.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.locatellilucas.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
