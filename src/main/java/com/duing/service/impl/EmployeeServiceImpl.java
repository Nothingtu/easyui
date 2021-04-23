package com.duing.service.impl;

import com.duing.dao.EmployeeDao;
import com.duing.domain.Employee;
import com.duing.service.EmployeeService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @program: demo
 * @description:
 * @author: zhang jie
 * @create: 2021-04-21 23:50
 */

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeDao employeeDao;

    @Override
    public int addEmployee(Employee employee) {
        return employeeDao.insertEmployee(employee);
    }

    @Override
    public int removeEmployee(String[] id) {
        Integer[] ids = new Integer[id.length];
        for (int i = 0; i < id.length; i++) {
            ids[i] = Integer.parseInt(id[i]);
        }

        return employeeDao.deleteEmployee(ids);
    }

    @Override
    public int updateEmployee(Employee employee) {
        return employeeDao.updateEmployee(employee);
    }

    @Override
    public Employee selectEmployeeById(Integer id) {
        return employeeDao.selectOneEmployee(id);
    }

    @Override
    public Map selectListEmployee( Map map) {

        Page pageInfo =  PageHelper.startPage((Integer)map.get("page"), (Integer)map.get("rows"));
        List<Employee> list = employeeDao.selectListEmployee(map);

        long total = pageInfo.getTotal();


        Map rlt = new HashMap<String,Object>();
        rlt.put("rows",list);
        rlt.put("total",total);


        return rlt;

    }
}
