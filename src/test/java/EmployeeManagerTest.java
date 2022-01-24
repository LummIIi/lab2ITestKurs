import com.example.BankService;
import com.example.Employee;
import com.example.EmployeeManager;
import com.example.EmployeeRepository;
import org.assertj.core.api.Assert;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.assertj.core.api.AssertionsForClassTypes.assertThatExceptionOfType;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.mock;

public class EmployeeManagerTest {
    BankService bankService = mock(BankService.class);

    EmployeeRepository employeeRepository = new EmployeeMockito();

    EmployeeManager employeeManager = new EmployeeManager(employeeRepository, bankService);


    @Test
    void testIfEmployeeManagerReturnsBankServiceAndRepository() {
        var result = employeeManager.payEmployees();

        assertThat(result).isEqualTo(2);

    }

    @Test
    void testIfRuntimeExceptionGetsExecuted(){
        Employee employee = new Employee("Stina" ,200);
        employee.setPaid(false);
        employeeRepository.save(employee);
        EmployeeManager employeeManager = new EmployeeManager(employeeRepository,bankService);










    }








}
