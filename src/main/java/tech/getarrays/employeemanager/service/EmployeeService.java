package tech.getarrays.employeemanager.service;

import org.springframework.stereotype.Service;
import tech.getarrays.employeemanager.model.Employee;
import tech.getarrays.employeemanager.repository.EmployeeRepo;

import java.util.List;

@Service
public interface EmployeeService {

    Employee addEmployee(Employee employee);
    List<Employee> findAllEmployees();
    Employee updateEmployee(Employee employee);
    void deleteEmployee(Long id);
    Employee findEmployeeById(Long id);

}
