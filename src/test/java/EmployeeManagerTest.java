import com.example.BankService;
import com.example.Employee;
import com.example.EmployeeManager;
import com.example.EmployeeRepository;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
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



}
