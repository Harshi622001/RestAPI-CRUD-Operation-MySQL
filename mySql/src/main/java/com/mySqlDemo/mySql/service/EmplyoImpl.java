package com.mySqlDemo.mySql.service;

import com.mySqlDemo.mySql.entity.Employee;
import com.mySqlDemo.mySql.repository.EmplyoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmplyoImpl implements EmployeeService {
    @Autowired
    private EmplyoRepo emplyoRepo;

    @Override
    public Employee save(Employee e) {
        return emplyoRepo.save(e);
    }

    @Override
    public Employee get(Integer id) {
        Optional<Employee> e = emplyoRepo.findById(id);
        if (e.isPresent()) {
            return e.get();
        }
        return null;
    }

    @Override
    public List<Employee> findall() {
        List<Employee> e = emplyoRepo.findAll();
        return e;
    }

    @Override
    public Employee delete(Integer id) {
        Optional<Employee> e = emplyoRepo.findById(id);
        if (e.isPresent()) {
            Employee e1 = e.get();
            emplyoRepo.delete(e1);
        }
        return null;
    }
}
