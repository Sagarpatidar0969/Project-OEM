package com.example.oem.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.oem.dto.EmployeeDto;
import com.example.oem.dto.EmployeeResponseDto;
import com.example.oem.service.EmployeeService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/employees")
@RequiredArgsConstructor
public class EmployeeController {
	private final EmployeeService employeeService;

	@PostMapping
	public ResponseEntity<EmployeeResponseDto> createEmployee(@RequestBody EmployeeDto employeeDto) {

		EmployeeResponseDto response = employeeService.createEmployee(employeeDto);

		return new ResponseEntity<>(response, HttpStatus.CREATED);
	}

}
