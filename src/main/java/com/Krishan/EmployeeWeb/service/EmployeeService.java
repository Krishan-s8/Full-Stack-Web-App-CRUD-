package com.Krishan.EmployeeWeb.service;

import com.Krishan.EmployeeWeb.exceptions.UserNotFoundException;
import com.Krishan.EmployeeWeb.model.Employee;
import com.Krishan.EmployeeWeb.repo.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class EmployeeService {
    private final EmployeeRepo employeeRepo;

    @Autowired
    public EmployeeService(EmployeeRepo employeeRepo) {
        this.employeeRepo = employeeRepo;
    }

    public Employee addEmployee(Employee employee){
        employee.setEmpCode(UUID.randomUUID().toString());
        return employeeRepo.save(employee);
    }
    public List<Employee> findAllEmployees(){
        return employeeRepo.findAll();
    }

    public Employee updateEmployee(Employee employee){
        return employeeRepo.save(employee);
    }

    public Employee findEmployeeByEmpID(Long empID) {
        return employeeRepo.findEmployeeByEmpID(empID)
                .orElseThrow(() -> new UserNotFoundException("Employee not found with ID: " + empID));
    }

    public Employee deleteEmployee(Long empID ){
        return employeeRepo.deleteEmployeeByEmpID(empID);
    }
}
