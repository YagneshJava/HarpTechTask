package com.v1.task.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.v1.task.entities.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Long>{

	void removeById(Long id);

}
