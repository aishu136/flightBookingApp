package com.example.flightApplication.repository;

import com.example.flightApplication.entity.person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface personDao extends JpaRepository<person,Long> {
}
