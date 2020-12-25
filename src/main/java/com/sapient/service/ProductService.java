package com.sapient.service;

import java.util.List;

import com.sapient.model.Product;

import org.springframework.stereotype.Service;

@Service
public interface ProductService{
    List<Product> findAll();
    List<Product> getProducts(String groupbyvalue,String actualvalue);
}