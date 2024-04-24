package com.ecommerce.productservice.models;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
public class Instructor extends User{
    private Double salary;
    private String skill;
}
