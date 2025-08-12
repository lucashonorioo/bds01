package com.devsuperior.bds01.services.impl;

import com.devsuperior.bds01.dto.DepartmentResponseDTO;
import com.devsuperior.bds01.entities.Department;
import com.devsuperior.bds01.repositories.DepartmentRepository;
import com.devsuperior.bds01.services.DepartmentService;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class DepartmentServiceImpl implements DepartmentService {

    private final DepartmentRepository departmentRepository;

    public DepartmentServiceImpl(DepartmentRepository departmentRepository) {
        this.departmentRepository = departmentRepository;
    }

    @Transactional(readOnly = true)
    @Override
    public List<DepartmentResponseDTO> findAll() {
        List<Department> departments = departmentRepository.findAll(Sort.by("name"));
        return departments.stream().map(DepartmentResponseDTO::new).collect(Collectors.toList());
    }

}
