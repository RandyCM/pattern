package com.randy.pattern.strategy.systemuse;

/**
 * @author chenming
 * @data 2018/11/12 16:35
 * @filename
 * @describle
 * @email chenming@evergande.com
 */

public class Student {
    private int id;
    private String name;
    private String age;
    //班级
    private String cls;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getCls() {
        return cls;
    }

    public void setCls(String cls) {
        this.cls = cls;
    }
}
