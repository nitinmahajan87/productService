package com.ecommerce.productservice.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@Entity
@Getter
@Setter
@NoArgsConstructor
public class GenericProduct {
    @Id
    @GeneratedValue
    private Long Id;
    private String name;
    private int price;
    
    public GenericProduct(String name, int price) {
        this.name = name;
        this.price = price;
    }
}
