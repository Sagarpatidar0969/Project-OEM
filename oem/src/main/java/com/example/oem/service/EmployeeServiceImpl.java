package com.example.oem.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.oem.dto.EmployeeDto;
import com.example.oem.dto.EmployeeResponseDto;
import com.example.oem.model.Employee;
import com.example.oem.repository.EmployeeRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class EmployeeServiceImpl implements EmployeeService{
	
	private final EmployeeRepository employeeRepository;
	
	 @Override
	    public EmployeeResponseDto createEmployee(EmployeeDto requestDto) {

	     
		 if(employeeRepository.existsByEmail(requestDto.getEmail())) {
			 throw new RuntimeException("Employee with this email already exists");
	        
		 }
		 
		 Employee employee = mapToEntity(requestDto);
	        Employee savedEmployee = employeeRepository.save(employee);

	        return mapToResponseDto(savedEmployee);
	    }
	
	
	 


private Employee mapToEntity(EmployeeDto dto) {
    return Employee.builder()
            .name(dto.getName())
            .email(dto.getEmail())
            .department(dto.getDepartment())
            .salary(dto.getSalary())
            .build();
}
private EmployeeResponseDto mapToResponseDto(Employee employee) {
    return EmployeeResponseDto.builder()
            .id(employee.getId())
            .name(employee.getName())
            .email(employee.getEmail())
            .department(employee.getDepartment())
            .salary(employee.getSalary())
            .build();
}

}
