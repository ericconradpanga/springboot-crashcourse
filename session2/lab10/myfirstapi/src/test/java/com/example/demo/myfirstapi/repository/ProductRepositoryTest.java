package com.example.demo.myfirstapi.repository;

import com.example.demo.myfirstapi.model.Product;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import static org.junit.jupiter.api.Assertions.*;

class ProductRepositoryTest {
    ProductRepository productRepository = new ProductRepository();
    static List<Product> products = new ArrayList<>();

    @BeforeAll
    static void setUp() {
        AtomicLong nextId = new AtomicLong(1);

        products.add(new Product(nextId.getAndIncrement(), "Laptop", 1200.00));
        products.add(new Product(nextId.getAndIncrement(), "Mouse", 25.50));
        products.add(new Product(nextId.getAndIncrement(), "Keyboard", 75.00));
    }

    @Test
    void findAll() {
        assertEquals(products, productRepository.findAll());
    }

    @Test
    void findById() {
        assertEquals(products.getFirst(), productRepository.findById(1L).get());
    }

    @Test
    void save() {
        Product product = new Product("Milk", 100);
        productRepository.save(product);
        assertEquals(product, productRepository.findById(4L).get());
    }
}