package com.mySqlDemo.mySql.service;

import com.mySqlDemo.mySql.entity.Employee;

import java.util.List;

public interface EmployeeService {
    Employee save(Employee e);

    Employee get(Integer id);

    List<Employee> findall();

    Employee delete(Integer id);
}
