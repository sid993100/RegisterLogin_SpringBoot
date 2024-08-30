package com.sid993100.RegisterLogin_SpringBoot.Service;

import com.sid993100.RegisterLogin_SpringBoot.Dto.EmployeeDTO;
import com.sid993100.RegisterLogin_SpringBoot.Dto.LoginDTO;
import com.sid993100.RegisterLogin_SpringBoot.Response.LoginResponse;

public interface EmployeeService {
    String addEmployee(EmployeeDTO employeeDTO);
    LoginResponse loginEmployee(LoginDTO loginDTO);
}
