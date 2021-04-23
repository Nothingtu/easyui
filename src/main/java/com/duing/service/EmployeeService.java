package com.duing.service;

import com.duing.domain.Employee;
import java.util.Map;

public interface EmployeeService {

    int addEmployee(Employee employee);

    int removeEmployee(String[] id);

    int updateEmployee(Employee employee);

    Employee selectEmployeeById(Integer id);

    Map selectListEmployee( Map map);
}
