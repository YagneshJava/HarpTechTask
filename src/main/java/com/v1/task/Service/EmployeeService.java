package com.v1.task.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.v1.task.Repo.EmployeeRepo;
import com.v1.task.entities.Employee;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepo repo;
	
	
	public void saveEmployee(Employee emp) {
		try {
			repo.save(emp);
		}finally {
			
		}
	}


	public void updateEmployee(Employee emp) {
		try {
			Employee empl = repo.getOne(emp.getId());
			empl.setAge(emp.getAge());
			empl.setFirstName(emp.getFirstName());
			empl.setLastName(emp.getLastName());
			empl.setEmail(emp.getEmail());
			repo.save(empl);
		}finally {
			
		}
		
	}


	public void deleteEmployee(Long id) {
		try {
			repo.removeById(id);
		}finally {
			
		}
		
	}


	public List<Employee> getAllEmployee() {
		try {
			return repo.findAll();
		}finally {
			
		}
	}
	
}
