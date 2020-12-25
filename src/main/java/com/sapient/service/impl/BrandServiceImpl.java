package com.sapient.service.impl;

import java.util.List;

import com.sapient.model.Brand;
import com.sapient.repository.BrandRepository;
import com.sapient.service.BrandService;

import org.springframework.beans.factory.annotation.Autowired;

public class BrandServiceImpl implements BrandService {

    @Autowired
    private BrandRepository brandRepository;

    @Override
    public List<Brand> findAll() {        
        return brandRepository.findAll();
    }
    
}