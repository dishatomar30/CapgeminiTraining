package com.gal.dao;

import com.gal.model.Department;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface  DepartmentDao {
    Department find(int depid);

    List<Department> findAll();

    void update(Department department);

    void add(Department department);

    void delete(int departmentId);
}