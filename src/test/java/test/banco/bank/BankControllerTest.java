package test.banco.bank;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import test.banco.bank.controller.bankController;
import test.banco.bank.domain.Employee;
import test.banco.bank.service.IEmployeeService;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class BankControllerTest {

    @InjectMocks
    private bankController bankController;

    @Mock
    private IEmployeeService employeeService;

    @Test
    public void given_whenGetEmployees_thenReturnEMployees() {
        List<Employee> employess = buildEmployees();
        when(employeeService.getEmployees()).thenReturn(employess);
        List<Employee> list = bankController.getEmployees();
        Assert.assertEquals(list.size(), employess.size());

    }

    private List<Employee> buildEmployees(){
        List<Employee> employess = new ArrayList<>();
        employess.add(new Employee(1,"Miguel Vargas", "Full stack"));
        employess.add(new Employee(2, "Juan", "back End"));
        employess.add(new Employee(3, "Andres", "developer"));
        employess.add(new Employee(4, "Julio", "Full stack"));
        return employess;
    }
}
