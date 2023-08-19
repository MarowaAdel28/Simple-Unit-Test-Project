package com.gizaSystem.service;

import com.gizaSystem.entity.Employee;
import com.gizaSystem.repo.EmployeeRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ValidationService {

    private final EmployeeRepo employeeRepo;

    public int sum(int num1, int num2) {
        int i=5;
        int result = num1+num2+i;
        return result;
    }
    public boolean isNameUnique(String name, int id) {
        int result = sum(1,2);
        Employee employee = employeeRepo.findByNameIgnoreCase(name);
        if(employee == null) {
            return true;
        } else if(employee.getId()==id) {
            return true;
        }
        return false;
    }

    public boolean isEmail(String email) {

        return email.contains("@");
    }

    public boolean isEmailUnique(String email, int id) {
        Employee employee = employeeRepo.findByEmail(email);
        if(employee == null) {
            return true;
        } else if(employee.getId()==id) {
            return true;
        }
        return false;
    }

    public boolean isAgeValid(int age) {
        return !(age>=50 || age<=20);
    }
}
