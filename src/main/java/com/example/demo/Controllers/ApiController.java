package com.example.demo.Controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.Models.Employee;
import com.example.demo.Repositories.EmployeeRepository;
import com.example.demo.Services.EmployeeService;

@RestController
public class ApiController {

	@Autowired
	EmployeeRepository serviceRepository;
	
	@Autowired
	EmployeeService service;
	
	@GetMapping("/get")
	List<Employee> getList(){
		return serviceRepository.findAll();
	}
	@PostMapping("/post")
	public Employee create(@RequestBody Employee emp) {
	return serviceRepository.save(emp);
	}
	@GetMapping("/get/{id}")
	public Optional<Employee> getbyid(@PathVariable int id){
		return service.getEmployee(id);
	}


}
