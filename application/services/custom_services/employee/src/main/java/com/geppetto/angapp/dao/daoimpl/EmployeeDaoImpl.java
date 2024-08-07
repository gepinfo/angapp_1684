package com.geppetto.angapp.dao.daoimpl;

import com.geppetto.angapp.model.Employee;
import com.geppetto.angapp.repository.EmployeeRepository;
import com.geppetto.angapp.dao.EmployeeDao;
import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;

@Service
public class EmployeeDaoImpl implements EmployeeDao{

    private final EmployeeRepository employeeRepository;

     public EmployeeDaoImpl(EmployeeRepository employeeRepository) {
       this.employeeRepository = employeeRepository;
}

    @Override
    public Employee create(Employee employee) {
      return employeeRepository.save(employee);
    }



    @Override
    public List<Employee> getAllValues() {
      return employeeRepository.findAll();
    }


    @Override
    public Optional<Employee> update(String id) {
      return employeeRepository.findById(id);
    }


    @Override
    public void delete(String id) {
      employeeRepository.deleteById(id);
    }

}
