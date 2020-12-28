package com.sapient.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sapient.model.Brand;
import com.sapient.repository.BrandRepository;
import com.sapient.service.BrandService;

@Service
public class BrandServiceImpl implements BrandService {

    @Autowired
    private BrandRepository brandRepository;

    @Override
    public List<Brand> findAll() {        
        return brandRepository.findAll();
    }
    
}