package com.example.oem.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class EmployeeDto{

	 @NotBlank(message = "Name is required")
	    private String name;

	    @Email(message = "Invalid email")
	    @NotBlank(message = "Email is required")
	    private String email;

	    @NotBlank(message = "Department is required")
	    private String department;

	    @NotNull(message = "Salary is required")
	    private Double salary;
	}
	

