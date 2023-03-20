package org.example.hotel.service;


import org.example.hotel.controller.AdminController;
import org.example.hotel.dtoEntity.Employee;
import org.example.hotel.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
    @Autowired
    EmployeeRepository employeeRepository;
    @Autowired
    AdminController adminController;

    public void checkIsAdmin(Employee employee) {
        Employee exist = employeeRepository.getByPhone(employee.getPhone());
        if (exist == null) {
            System.out.println("sorry doesn't exist user!!!");
            adminController.menu();
        }
        else if(exist.getPhone().equals(employee.getPhone())){
             adminController.adminStart();
        }

    }
}
