package com.example.oem.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(collection = "employees")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Employee {

	@Id
	private String id;

	private String name;
	private String email;
	private String department;
	private Double salary;

}
