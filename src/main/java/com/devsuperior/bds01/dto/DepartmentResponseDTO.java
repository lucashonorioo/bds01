package com.devsuperior.bds01.dto;

import com.devsuperior.bds01.entities.Department;

public class DepartmentResponseDTO {

    public Long id;
    public String name;

    public DepartmentResponseDTO(){

    }

    public DepartmentResponseDTO(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public DepartmentResponseDTO(Department department) {
        id = department.getId();
        name = department.getName();
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
