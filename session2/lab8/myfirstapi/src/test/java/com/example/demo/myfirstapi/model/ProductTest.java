package com.example.demo.myfirstapi.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductTest {
    Product product;

    @BeforeEach
    void setUp() {
        product = new Product(1L, "test", 100);
    }

    @Test
    void getId() {
        assertEquals(1L, product.getId());
    }

    @Test
    void getName() {
        assertEquals("test", product.getName());
    }

    @Test
    void getPrice() {
        assertEquals(100, product.getPrice());
    }

    @Test
    void setId() {
        product.setId(2L);
        assertEquals(2L, product.getId());
    }

    @Test
    void setName() {
        product.setName("test2");
        assertEquals("test2", product.getName());
    }

    @Test
    void setPrice() {
        product.setPrice(150);
        assertEquals(150, product.getPrice());
    }
}