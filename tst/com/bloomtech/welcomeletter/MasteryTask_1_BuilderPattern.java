package com.bloomtech.welcomeletter;

import com.bloomtech.welcomeletter.models.Company;
import com.bloomtech.welcomeletter.models.Employee;
import com.bloomtech.welcomeletter.models.Role;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class MasteryTask_1_BuilderPattern {

    @Test
    void testBuilderCreatesValidEmployeeObjects_allFields() {
        String testemail = "test@email.com";
        Company c1 = new Company.builder().build();

        Employee emp = new Employee.builder()
                .withFirstname("firstname")
                .withLastname("lastname")
                .withPhonenumber("11111111")
                .withEmail(testemail)
                .withCompany(c1)
                .withRole(Role.ENGINEERING)
                .withSalary(150000)
                .withStartdate(LocalDate.now())
                .build();

        assertNotNull(emp.getFirstname());
        assertNotNull(emp.getCompany());
        assertEquals(testemail, emp.getEmail());
    }

    @Test
    void testBuilderCreatesValidEmployeeObjects_onlyRequiredFields() {
        Company c1 = new Company.builder().build();

        Employee emp = new Employee.builder()
                .withFirstname("firstname")
                .withCompany(c1)
                .build();

        assertNotNull(emp.getFirstname());
        assertNotNull(emp.getCompany());
    }

    @Test
    void testBuilderCreatesInvalidEmployeeObject_returnsRuntimeException() {
        Company c1 = new Company.builder().build();

        assertThrows(RuntimeException.class, ()->{
            new Employee.builder()
                    .withFirstname("just firstname")
                    .build();
        });

        assertThrows(RuntimeException.class, ()->{
            new Employee.builder()
                    .withCompany(c1)
                    .build();
        });
    }
}