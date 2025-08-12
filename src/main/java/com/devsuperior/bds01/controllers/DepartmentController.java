package com.devsuperior.bds01.controllers;

import com.devsuperior.bds01.dto.DepartmentResponseDTO;
import com.devsuperior.bds01.services.DepartmentService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/departments")
public class DepartmentController {

    private final DepartmentService departmentService;

    public DepartmentController(DepartmentService departmentService) {
        this.departmentService = departmentService;
    }

    @GetMapping
    ResponseEntity<List<DepartmentResponseDTO>> findAllSortedByName(){
        List<DepartmentResponseDTO> departmentResponseDTOS = departmentService.findAll();
        return ResponseEntity.ok().body(departmentResponseDTOS);
    }
}
