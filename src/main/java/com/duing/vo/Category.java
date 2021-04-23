package com.duing.vo;



import java.io.Serializable;

/**
 * @program: easyui2
 * @description:
 * @author: zhang jie
 * @create: 2021-04-22 12:13
 */
public class Category implements Serializable {

    private Integer id;
    private String description;
    private Integer pid;

    public Category(Integer id, String description, Integer pid) {
        this.id = id;
        this.description = description;
        this.pid = pid;
    }

    public Category() {
    }

    @Override
    public String toString() {
        return "Category{" +
                "id=" + id +
                ", description='" + description + '\'' +
                ", pid=" + pid +
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
}
