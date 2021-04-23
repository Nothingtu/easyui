package com.duing.service.impl;

import com.duing.dao.ItemDao;
import com.duing.service.ItemService;
import com.duing.vo.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program: easyui2
 * @description:
 * @author: zhang jie
 * @create: 2021-04-22 12:42
 */

@Service
public class ItemServiceImpl implements ItemService {
    @Autowired
    private ItemDao itemDao;

    public List<Item> find(){
        return itemDao.findAll();
    }
}
