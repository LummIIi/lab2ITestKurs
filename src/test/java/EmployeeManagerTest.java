import com.example.BankService;
import com.example.Employee;
import com.example.EmployeeManager;
import com.example.EmployeeRepository;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;



import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

import static org.mockito.ArgumentMatchers.anyDouble;
import static org.mockito.ArgumentMatchers.anyString;
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

    @Test
    @DisplayName("Employee should not recive payment")
    void payEmployeShouldThrowRuntimeException(){
        doThrow(new RuntimeException()).when(bankService).pay(anyString(), anyDouble());

        employeeManager.payEmployees();

     assertThat(employeeRepository.findAll().get(0).isPaid()).isFalse();
    }



}
