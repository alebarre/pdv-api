package com.alebarre.pdv.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.alebarre.pdv.entity.Sale;

@Repository
public interface SaleRepository extends JpaRepository<Sale, Long> {
}
