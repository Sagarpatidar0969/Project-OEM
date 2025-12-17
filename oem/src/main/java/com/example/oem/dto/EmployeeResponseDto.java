package com.example.oem.dto;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class EmployeeResponseDto {

    private String id;
    private String name;
    private String email;
    private String department;
    private Double salary;
}
