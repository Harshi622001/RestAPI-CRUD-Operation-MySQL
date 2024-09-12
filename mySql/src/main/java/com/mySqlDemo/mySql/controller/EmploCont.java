package com.mySqlDemo.mySql.controller;

import com.mySqlDemo.mySql.entity.Employee;
import com.mySqlDemo.mySql.service.EmployeeService;
import com.mySqlDemo.mySql.service.EmplyoImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmploCont {
    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/save")
    Employee save(@RequestBody Employee e) {
        return employeeService.save(e);

    }

    @GetMapping("/get/{id}")
    Employee get(@PathVariable Integer id) {
        return employeeService.get(id);

    }

    @GetMapping("/find")
    List<Employee> findall() {
        return employeeService.findall();

    }

    @DeleteMapping("/delete/id")
    Employee delete(@PathVariable Integer id) {
        return employeeService.delete(id);

    }
}
