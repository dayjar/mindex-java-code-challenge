package com.mindex.challenge.controller;

import com.mindex.challenge.data.Compensation;
import com.mindex.challenge.data.Employee;
import com.mindex.challenge.service.CompensationService;
import com.mindex.challenge.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/compensation")
public class CompensationController {

    @Autowired
    private CompensationService compensationService;

    @GetMapping("{id}")
    public Compensation read(@PathVariable String id) {
        return compensationService.read(id);
    }

    @PostMapping
    public Compensation create(@RequestBody Compensation compensation) {
        return compensationService.create(compensation);
    }
}
