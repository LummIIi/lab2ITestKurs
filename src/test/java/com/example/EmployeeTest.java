package com.example;

import org.junit.jupiter.api.Test;


import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class EmployeeTest {

    Employee employee = new Employee("stina", 200);



    @Test
    void testIfEmployeeReturnsCorrectSalary() {
        employee.setSalary(200);
        var result = employee.getSalary();
        assertThat(result).isEqualTo(200);
    }


    @Test
    void testIfEmplyeeReturnsCorrectName(){
        employee.setId("Stina");
        var result = employee.getId();
        assertThat(result).isEqualTo("Stina");
    }
    @Test
    void testIfEmployeeReturnsIfAIdIsPaid(){
        employee.setPaid(true);
        var result = employee.isPaid();
        assertThat(result).isEqualTo(true);
    }

    @Test
    void testifSGetIdForEmployeeName(){
        Employee employee = new Employee("Stina", 100);
        var result = employee.getId();
        assertThat(result).isEqualTo("Stina");
    }

    @Test
    void testIfGetIdReturnsToString(){
        Employee employee = new Employee("Stina", 300);
        var result = employee.toString();
        assertThat(result).isEqualTo("Employee [id=" + employee.getId() + ", salary=" + employee.getSalary() + "]");
    }


}

