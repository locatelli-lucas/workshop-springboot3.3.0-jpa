package com.locatellilucas.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.locatellilucas.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
