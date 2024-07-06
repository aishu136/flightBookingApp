package com.example.flightApplication.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class person {
    @Id
    private String id;
}
