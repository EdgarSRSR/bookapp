package com.example.bookapp;

import org.springframework.data.repository.CrudRepository;

//JPA interacts with the database that is why we need an employee repository
public interface EmployeeRepository extends CrudRepository<Employee, Integer> {

}
