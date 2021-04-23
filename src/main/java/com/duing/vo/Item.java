package com.duing.vo;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.List;

/**
 * @program: easyui2
 * @description:
 * @author: zhang jie
 * @create: 2021-04-22 12:12
 */
public class Item implements Serializable {

    private Integer id;
    @JsonProperty("text")
    private String description;
    private Integer pid;

    private String url;

    @JsonProperty("children")
    private List<Item> list;

    public Item(Integer id, String description, Integer pid, String url, List<Item> list) {
        this.id = id;
        this.description = description;
        this.pid = pid;
        this.url = url;
        this.list = list;
    }

    public Item() {
    }

    @Override
    public String toString() {
        return "Item{" +
                "id=" + id +
                ", description='" + description + '\'' +
                ", pid=" + pid +
                ", url='" + url + '\'' +
                ", list=" + list +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public List<Item> getList() {
        return list;
    }

    public void setList(List<Item> list) {
        this.list = list;
    }
}
