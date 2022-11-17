package com.example.payroll.Employee;

import org.springframework.web.bind.annotation.*;

import java.util.List;
/*
    To wrap your repository with a web layer, you must turn to Spring MVC. Thanks to Spring Boot,
    there is little in infrastructure to code. Instead, we can focus on actions.
    @RestController indicates that the data returned by each method will be written straight into the response body
    instead of rendering a template.
    An EmployeeRepository is injected by constructor into the controller.
    We have routes for each operation (@GetMapping, @PostMapping, @PutMapping and @DeleteMapping, corresponding to
    HTTP GET, POST, PUT, and DELETE calls). (NOTE: It’s useful to read each method and understand what they do.)
    EmployeeNotFoundException is an exception used to indicate when an employee is looked up but not found.
*/
@RestController
class EmployeeController {

    private final EmployeeRepository repository;

    EmployeeController(EmployeeRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/employees")
    List<Employee> all() {
        return repository.findAll();
    }

    @PostMapping("/employees")
    Employee newEmployee(@RequestBody Employee newEmployee) {
        return repository.save(newEmployee);
    }

    @GetMapping("/employees/{id}")
    Employee one(@PathVariable Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new EmployeeNotFoundException(id));
    }

    @PutMapping("/employees/{id}")
    Employee replaceEmployee(@RequestBody Employee newEmployee, @PathVariable Long id) {

        return repository.findById(id)
                .map(employee -> {
                    employee.setName(newEmployee.getName());
                    employee.setRole(newEmployee.getRole());
                    return repository.save(employee);
                })
                .orElseGet(() -> {
                    newEmployee.setId(id);
                    return repository.save(newEmployee);
                });
    }

    @DeleteMapping("/employees/{id}")
    void deleteEmployee(@PathVariable Long id) {
        repository.deleteById(id);
    }
}
