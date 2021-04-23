package com.duing.controller;

import com.duing.domain.Employee;
import com.duing.service.EmployeeService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * @program: demo
 * @description:
 * @author: zhang jie
 * @create: 2021-04-21 23:54
 */
@Controller
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @ResponseBody
    @RequestMapping("/add")
    public Map addEmployee(Employee employee) {
        Map map = new HashMap();
        map.put("code",employeeService.addEmployee(employee));
        map.put("msg","添加成功");
        return map;
    }

    @RequestMapping("/remove")
    @ResponseBody
    public Map removeEmployee(String[] id) {
        int code = employeeService.removeEmployee(id);
        String msg = "删除成功";
        Map map = new HashMap();
        map.put("code",code);
        map.put("msg",msg);

        return map;
    }

    @RequestMapping("/update")
    public int updateEmployee(Employee employee) {
        return employeeService.updateEmployee(employee);
    }

    @RequestMapping("/one")
    public Employee selectEmployeeById(Integer id) {
        return employeeService.selectEmployeeById(id);
    }

    @RequestMapping("/list")
    public String selectListEmployee() {
        return "employee";
    }

    @RequestMapping("/findAll")
    @ResponseBody
    public Map findAll(Integer page,Integer rows,String keyword,String sort,String order){
        Map map = new HashMap<String,Object>();
        map.put("page",page);
        map.put("rows",rows);
        if(!"".equals(keyword) && keyword != null){
            map.put("name",keyword);
        }
        if(!"".equals(sort) && sort != null){
            map.put("sort",sort);
        }
        if(!"".equals(order) && order != null){
            map.put("order",order);
        }
        return employeeService.selectListEmployee(map);
    }


}
