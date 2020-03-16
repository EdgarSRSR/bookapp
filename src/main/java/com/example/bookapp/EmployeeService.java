package com.example.bookapp;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

//   methods that will be called from the controller
public class EmployeeService {

  @Autowired
  EmployeeRepository employeeRepository;

  // Creates a list of all employees from the employee repository and returns it
  public List<Employee> getAllEmployees(){
    List<Employee>  employees = new ArrayList<Employee>();
    employeeRepository.findAll().forEach(employee -> employees.add(employee));
    return employees;
  }

  // returns an employee by id
  public Employee getEmployeeId(int id){
    return employeeRepository.findById(id).get();
  }

  // save an employee in the repository
  public void saveOrUpdate(Employee employee){
    employeeRepository.save(employee);
  }

  // delete Employee
  public void deleteEmployee(int id){
    employeeRepository.deleteById(id);
  }

}
