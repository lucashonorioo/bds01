package com.devsuperior.bds01.services;

import com.devsuperior.bds01.dto.EmployeeDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface EmployeeService{

    EmployeeDTO insert(EmployeeDTO employeeDTO);

    Page<EmployeeDTO> findAll(Pageable pageable);
}
