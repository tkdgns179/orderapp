package com.example.orderapp.repository;

import com.example.orderapp.domain.Shop;
import org.springframework.data.jpa.repository.JpaRepository;

interface ShopRepository extends JpaRepository<Shop, Long> {

}
