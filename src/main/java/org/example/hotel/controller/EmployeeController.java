package org.example.hotel.controller;

import org.example.hotel.dtoEntity.Employee;
import org.example.hotel.service.EmployeeService;
import org.example.hotel.util.Scan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class EmployeeController {
    @Autowired
    private AdminController adminController;
    @Autowired
    private EmployeeService  employeeService;

    public void login() {
        System.out.print("Enter phone: ");
        String phone = Scan.scannerStr.nextLine();
        Employee employee = new Employee();
        employee.setPhone(phone);
        employeeService.checkIsAdmin(employee);
    }
}
