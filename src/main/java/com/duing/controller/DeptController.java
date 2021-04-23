package com.duing.controller;

import com.duing.service.ItemService;
import com.duing.vo.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @program: demo
 * @description:
 * @author: zhang jie
 * @create: 2021-04-22 09:11
 */
@Controller
public class DeptController {

    @Autowired
    private ItemService itemService;

    @RequestMapping("/")
    public String index(){
        return "index";
    }


    @RequestMapping("/depts")
    public String depts(){
        return "employee";
    }

    @RequestMapping("/deptList")
    @ResponseBody
    public List<Item> deptList(){
        List<Item> i = itemService.find();
        return i;
    }
}
