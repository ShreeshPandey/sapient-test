package com.sapient.service;

import java.util.List;

import com.sapient.model.ProductCategory;

import org.springframework.stereotype.Service;

@Service
public interface ProductCategoryService {
    List<ProductCategory> findAll();
}