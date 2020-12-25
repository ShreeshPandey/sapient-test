package com.sapient.service.impl;

import java.util.List;

import com.sapient.model.ProductCategory;
import com.sapient.repository.ProductCategoryRepository;

import com.sapient.service.ProductCategoryService;

import org.springframework.beans.factory.annotation.Autowired;

public class ProductCategoryServiceImpl implements ProductCategoryService {

    @Autowired
    private ProductCategoryRepository productCategoryRepository;

    @Override
    public List<ProductCategory> findAll() {        
        return productCategoryRepository.findAll();
    }
    
}