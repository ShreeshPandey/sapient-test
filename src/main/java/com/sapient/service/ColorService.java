package com.sapient.service;

import java.util.List;

import com.sapient.model.Color;

import org.springframework.stereotype.Service;

@Service
public interface ColorService {
    List<Color> findAll();
}
