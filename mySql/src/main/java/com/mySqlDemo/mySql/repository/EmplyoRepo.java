package com.mySqlDemo.mySql.repository;

import com.mySqlDemo.mySql.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmplyoRepo extends JpaRepository<Employee, Integer> {

}
