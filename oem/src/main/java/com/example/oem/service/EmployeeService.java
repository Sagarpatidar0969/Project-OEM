package com.example.oem.service;

import java.util.List;

import com.example.oem.dto.EmployeeDto;
import com.example.oem.dto.EmployeeResponseDto;

public interface EmployeeService {

   public EmployeeResponseDto createEmployee(EmployeeDto requestDto);

//   public EmployeeResponseDto getEmployeeById(String id);
//
//   public List<EmployeeResponseDto> getAllEmployees();
//
//   public EmployeeResponseDto updateEmployee(String id, EmployeeDto requestDto);
//
//   public void deleteEmployee(String id);
}
