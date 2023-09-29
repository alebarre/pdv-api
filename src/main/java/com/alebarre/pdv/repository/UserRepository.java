package com.alebarre.pdv.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.alebarre.pdv.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
