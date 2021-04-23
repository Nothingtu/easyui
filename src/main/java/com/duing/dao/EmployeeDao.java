package com.duing.dao;

import com.duing.domain.Employee;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;


import java.util.List;
import java.util.Map;

@Mapper
public interface EmployeeDao {

    int insertEmployee(Employee employee);

    int deleteEmployee(@Param("ids") Integer[] id);

    int updateEmployee(Employee employee);

    Employee selectOneEmployee(Integer id);

    List<Employee> selectListEmployee(Map map);
}
