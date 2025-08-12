package com.devsuperior.bds01.services;

import com.devsuperior.bds01.dto.DepartmentResponseDTO;

import java.util.List;

public interface DepartmentService {

    List<DepartmentResponseDTO> findAll();

}
