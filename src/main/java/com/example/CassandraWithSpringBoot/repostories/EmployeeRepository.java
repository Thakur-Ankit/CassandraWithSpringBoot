package com.example.CassandraWithSpringBoot.repostories;

import com.example.CassandraWithSpringBoot.model.Employee;
import org.springframework.data.cassandra.repository.CassandraRepository;

public interface EmployeeRepository extends CassandraRepository<Employee, String>  {

    public Employee findById(Integer id);

    public void deleteById(Integer id);
}
