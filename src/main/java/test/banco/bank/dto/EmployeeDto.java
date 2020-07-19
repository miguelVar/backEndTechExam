package test.banco.bank.dto;

import com.sun.istack.NotNull;
import lombok.Data;
import lombok.NoArgsConstructor;
import test.banco.bank.domain.Employee;

import java.util.List;

@Data
@NoArgsConstructor
public class EmployeeDto {
    private int idEmployee;
    @NotNull
    private String fullName;

    @NotNull
    private String function;

    private List<Employee> employees;
    private Employee boss;
}
