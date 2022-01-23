import com.example.Employee;
import com.example.EmployeeRepository;

import java.util.List;

public class EmployeeMockito implements EmployeeRepository {
    @Override
    public List<Employee> findAll() {

        return List.of(new Employee("Stina", 200), new Employee("Felix",300));
    }

    @Override
    public Employee save(Employee e) {
        return null;
    }
}
