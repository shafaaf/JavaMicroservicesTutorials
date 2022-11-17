package com.example.payroll.Employee;

import org.springframework.data.jpa.repository.JpaRepository;

/*
With Employee object definition, we can now turn to Spring Data JPA to handle the tedious database interactions.
Spring Data JPA repositories are interfaces with methods supporting creating, reading, updating, and deleting records
against a back end data store. Some repositories also support data paging, and sorting, where appropriate.

To get all this free functionality, all we had to do was declare an interface which extends
Spring Data JPA’s JpaRepository, specifying the domain type as Employee and the id type as Long.
*/

interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
