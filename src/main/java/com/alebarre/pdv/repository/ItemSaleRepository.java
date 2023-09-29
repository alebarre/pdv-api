package com.alebarre.pdv.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.alebarre.pdv.entity.ItemSale;

@Repository
public interface ItemSaleRepository extends JpaRepository<ItemSale, Long> {
}
