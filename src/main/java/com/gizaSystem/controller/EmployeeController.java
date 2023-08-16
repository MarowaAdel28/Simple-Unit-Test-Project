package com.gizaSystem.controller;

import com.gizaSystem.dto.EmployeeGetterDto;
import com.gizaSystem.dto.EmployeeSetterDto;
import com.gizaSystem.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/employee")
@RequiredArgsConstructor
public class EmployeeController {

    private final EmployeeService employeeService;

    @PostMapping
    public int addEmployee(@RequestBody EmployeeSetterDto employeeDto) {
        return employeeService.createEmployee(employeeDto);
    }

    @GetMapping("/{id}")
    public EmployeeGetterDto getEmployee(@PathVariable("id") int id) {
        return employeeService.getEmployee(id);
    }

    @PutMapping("/{id}")
    public int updateEmployee(@RequestBody EmployeeSetterDto employeeDto, @PathVariable("id") int id) {
        return employeeService.updateEmployee(employeeDto,id);
    }

    @DeleteMapping("/{id}")
    public void deleteEmployee(@PathVariable("id") int id) {
        employeeService.deleteEmployee(id);
    }
}
