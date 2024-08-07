package com.geppetto.angapp.service;

import com.geppetto.angapp.dto.EmployeeDto;
import java.util.List;
import java.util.Map;

public interface EmployeeService {

    EmployeeDto create(EmployeeDto employeeDto);



    List<EmployeeDto> getAllValues();


    EmployeeDto update(EmployeeDto employeeDto);


    String delete(String id);



}
