package com.gal.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.gal.model.Department;

import java.util.List;

@Repository
public interface DepartmentRepository extends JpaRepository<Department,Integer> {
    //HPL JPQL : SQL query with objects in mind
    //select * from department where department_name= :name
    //select d from Department d where d.depname= :name

    @Query("from Department d where d.depname = :depname")
    Department findByName(String name);
    //find the latest department started
    //find the department having no manager
//    @Query(value="select * from department d where d.department_name=:depname", nativeQuery= true)
//    Department findByName(String depname);
    //find the department(s) whose managerid is given
    // find the department(s) whose manager name is given


    @Query(value="select * from department d where d.manager_id = :managerId", nativeQuery=true)
    List<Department> findByManagerId(int managerId);

    @Query(value="select * from department d where d.manager_name = :managerName", nativeQuery=true)
    List<Department> findByManagerName(String managerName);
}