package test.banco.bank.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import test.banco.bank.domain.Employee;
import test.banco.bank.dto.EmployeeDto;
import test.banco.bank.repository.IEmployeeRepository;
import test.banco.bank.service.IEmployeeService;
import java.util.List;


@Service
public class EmployeeServiceImpl implements IEmployeeService {

    @Autowired
    private IEmployeeRepository employeeRepository;

    @Override
    public List<Employee> getEmployees() {
        return employeeRepository.findAll();
    }

    @Override
    public Employee postEmployee(EmployeeDto employee) {
        Employee requestEmployee = new Employee();
        if(employee.getIdEmployee()!=0){
            requestEmployee.setIdEmployee(employee.getIdEmployee());
        }

        requestEmployee.setFullName(employee.getFullName());
        requestEmployee.setFunction(employee.getFunction());
        requestEmployee.setEmployees(employee.getEmployees());
//        requestEmployee.setBoss(employee.getBoss());

        return employeeRepository.save(requestEmployee);
    }

    @Override
    public boolean deleteEmployee(Integer idEmployee) {
        try {
            employeeRepository.deleteById(idEmployee);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
