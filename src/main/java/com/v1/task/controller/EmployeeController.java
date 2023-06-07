package com.v1.task.controller;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.v1.task.Service.EmployeeService;
import com.v1.task.entities.Employee;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
public class EmployeeController {

	static Logger log = Logger.getLogger(EmployeeController.class);

	@Autowired
	private EmployeeService service;

	@GetMapping("/")
	public String test() {
		return "Done";
	}

	@PostMapping("/saveEmployee")
	public String saveEmployee(@RequestBody Employee emp) {

		try {
			service.saveEmployee(emp);
			log.info("saveEmployee Executed");
			return "Employee Saved Successfully";
		} catch (Exception e) {
			log.error("Exception Occured in saveEmployee", e);
			return e.getMessage();
		}

	}
	
	@PutMapping("/updateEmployee")
	public String updateEmployee(@RequestBody Employee emp) {
		try {
			service.updateEmployee(emp);
			log.info("updateEmployee Executed");
			return "Employee Updated Successfully";
		} catch (Exception e) {
			log.error("Exception Occured in updateEmployee", e);
			return e.getMessage();
		}
	}
	
	
	@DeleteMapping("/deleteEmployee/{id}")
	public String deleteEmployee(@PathVariable Long id) {
		try {
			service.deleteEmployee(id);
			log.info("delete Employee Executed");
			return "Employee Deleted Successfully";
		} catch (Exception e) {
			log.error("Exception Occured in delete Employee", e);
			return e.getMessage();
		}
	}
	
	@GetMapping("/getAllUsers")
	public List<Employee> getEmployees(){
		try {
			return service.getAllEmployee();
		}catch (Exception e) {
			 log.error("Exception Occured in getEmployees ", e);
			return null;
		}
	}
}
