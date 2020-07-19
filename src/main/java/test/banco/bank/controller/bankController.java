package test.banco.bank.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import test.banco.bank.constants.ResourceMapping;
import test.banco.bank.domain.Employee;
import test.banco.bank.dto.EmployeeDto;
import test.banco.bank.service.IEmployeeService;

import java.util.List;

@RestController
@RequestMapping("/employee")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class bankController {

    @Autowired
    private IEmployeeService service;

    @GetMapping(value = ResourceMapping.lIST_EMPLOYEE)
    public List<Employee> getEmployees(){
        return service.getEmployees();
    }

    @PostMapping(value = ResourceMapping.CREATE_EMPLOYEE)
    public Employee posEmployee(@RequestBody EmployeeDto employeeDto){
        return service.postEmployee(employeeDto);
    }

    @DeleteMapping(value = ResourceMapping.DELETE_EMPLOYEE)
    public boolean deleteEmployee(@RequestParam("idEmployee") Integer idEmployee) {
        return service.deleteEmployee(idEmployee);
    }

    @PutMapping(value = ResourceMapping.UPDATE_EMPLOYEE)
    public Employee updateEmployee(@RequestBody EmployeeDto employee) {
        return service.postEmployee(employee);
    }
}

