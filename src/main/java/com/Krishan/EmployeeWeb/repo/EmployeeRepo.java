package com.Krishan.EmployeeWeb.repo;

import com.Krishan.EmployeeWeb.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface EmployeeRepo extends JpaRepository<Employee, Long> {

    Employee deleteEmployeeByEmpID(Long empID);

    Optional<Employee> findEmployeeByEmpID(Long empID);
}
