package com.sapient.service.impl;

import java.util.List;

import com.sapient.model.Color;
import com.sapient.repository.ColorRepository;
import com.sapient.service.ColorService;

import org.springframework.beans.factory.annotation.Autowired;

public class ColorServiceImpl implements ColorService {

    @Autowired
    private ColorRepository colorRepository;

    @Override
    public List<Color> findAll() {        
        return colorRepository.findAll();
    }
    
}