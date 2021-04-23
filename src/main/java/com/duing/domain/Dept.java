package com.duing.domain;


import java.io.Serializable;
import java.util.List;

/**
 * @program: demo
 * @description:
 * @author: zhang jie
 * @create: 2021-04-21 22:02
 */

public class Dept implements Serializable {

    private Integer id;
    private String location;
    private String name;

    private List children;


    public Dept(Integer id, String location, String name) {
        this.id = id;
        this.location = location;
        this.name = name;
    }

    public Dept() {
    }

    @Override
    public String toString() {
        return "Dept{" +
                "id=" + id +
                ", location='" + location + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
