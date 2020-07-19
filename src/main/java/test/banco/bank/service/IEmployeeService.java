package test.banco.bank.service;

import test.banco.bank.domain.Employee;
import test.banco.bank.dto.EmployeeDto;

import java.util.List;

public interface IEmployeeService {

    List<Employee> getEmployees();

    Employee postEmployee(EmployeeDto employee);

    boolean deleteEmployee(Integer idEmployee);


}
