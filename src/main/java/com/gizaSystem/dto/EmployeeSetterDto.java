package com.gizaSystem.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class EmployeeSetterDto {

    String name;
    String email;
    int age;
    double salary;
}
