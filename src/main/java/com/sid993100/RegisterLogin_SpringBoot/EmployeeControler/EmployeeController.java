package com.sid993100.RegisterLogin_SpringBoot.EmployeeControler;

import com.sid993100.RegisterLogin_SpringBoot.Dto.EmployeeDTO;
import com.sid993100.RegisterLogin_SpringBoot.Dto.LoginDTO;
import com.sid993100.RegisterLogin_SpringBoot.Response.LoginResponse;
import com.sid993100.RegisterLogin_SpringBoot.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("api/v1/employee")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;
    @PostMapping(path = "/save")
    public String saveEmployee(@RequestBody EmployeeDTO employeeDTO)
    {
        String id = employeeService.addEmployee(employeeDTO);
        return id;
    }
    @PostMapping(path = "/login")
    public ResponseEntity<?> loginEmployee(@RequestBody LoginDTO loginDTO)
    {
        LoginResponse loginResponse = employeeService.loginEmployee(loginDTO);
        return ResponseEntity.ok(loginResponse);
    }
}
