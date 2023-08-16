package com.gizaSystem.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeGetterDto {

    int id;
    String name;
    String email;
    int age;
    double salary;
}
