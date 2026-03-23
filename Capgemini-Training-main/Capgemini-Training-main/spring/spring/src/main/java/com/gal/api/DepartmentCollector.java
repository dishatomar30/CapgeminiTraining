//package com.gal.api;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//import com.gal.model.Department;
//import com.gal.service.DepartmentService;
//
//@RestController
//@RequestMapping("/department")
//public class DepartmentController {
//
//    @Autowired
//    DepartmentService departmentService;
//
//    // GET department by id using RequestParam
//    // URL: http://localhost:8080/department?id=10
//    @GetMapping
//    public Department getDepartmentById(@RequestParam int id) {
//        return departmentService.find(id);
//    }
//
//    // GET department by id using PathVariable
//    // URL: http://localhost:8080/department/10
//    @GetMapping("/{id}")
//    public Department getDepartment(@PathVariable int id) {
//        return departmentService.find(id);
//    }
//
//    // GET department by name
//    // URL: http://localhost:8080/department/byname?name=HR
//    @GetMapping("/byname")
//    public Department getDepartmentByName(@RequestParam String name) {
//        return departmentService.findByName(name);
//    }
//}