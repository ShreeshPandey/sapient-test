package com.sapient.service;

import java.util.List;

import com.sapient.model.Brand;

import org.springframework.stereotype.Service;

@Service
public interface BrandService{
    List<Brand> findAll();
}