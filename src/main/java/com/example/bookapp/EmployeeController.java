package com.example.bookapp;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

  @Autowired
  EmployeeService employeeService;

  @GetMapping("/employee")
  private List<Employee> getAllEmployees() {
    return employeeService.getAllEmployees();
  }

  @GetMapping("/employee/{id}")
  private Employee getEmployeeId(@PathVariable("id") int id) {
    return employeeService.getEmployeeId(id);
  }

  @DeleteMapping("/persons/{id}")
  private void deleteEmployee(@PathVariable("id") int id) {
    employeeService.deleteEmployee(id);
  }

  @PostMapping("/persons")
  private int savePerson(@RequestBody Employee employee) {
    employeeService.saveOrUpdate(employee);
    return employee.getId();
  }

}
