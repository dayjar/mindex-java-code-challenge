package com.mindex.challenge.service.impl;

import com.mindex.challenge.data.Compensation;
import com.mindex.challenge.data.Employee;
import com.mindex.challenge.service.CompensationService;
import com.mindex.challenge.service.EmployeeService;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.sql.Date;

import static org.junit.jupiter.api.Assertions.*;

class CompensationServiceImplTest {

    @Autowired
    CompensationService compensationService;

    @Autowired
    EmployeeService employeeService;

    @Test
    void createAndReadOneCompensationTest() {
        Compensation compensation = new Compensation();
        compensation.setEmployeeId("b7839309-3348-463b-a7e3-5de1c168beb3");
        compensation.setSalary(500000);
        compensation.setEffectiveDate(new Date(0L)); // he started earning at the epoch, seems legit
        compensationService.create(compensation);

        Compensation retrieved = compensationService.read(compensation.getEmployeeId());
        assertEquals(compensation.getSalary(), retrieved.getSalary());
        assertEquals(compensation.getEffectiveDate(), retrieved.getEffectiveDate());
    }

}