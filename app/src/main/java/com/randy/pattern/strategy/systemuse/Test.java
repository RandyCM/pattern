package com.randy.pattern.strategy.systemuse;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author chenming
 * @data 2018/11/12 16:36
 * @filename
 * @describle
 * @email chenming@evergande.com
 */

public class Test {
    public void test(){
        List<Student> students = new ArrayList<>();
        Student student = new Student();
        student.setId(12);
        student.setName("Randy12");
        students.add(student);

        student = new Student();
        student.setId(8);
        student.setName("Randy8");
        students.add(student);

        student = new Student();
        student.setId(2);
        student.setName("Randy2");
        students.add(student);
        //数组排序里面用到策略模式。  把排序算法抽象出来，排序的时候可以自定义排序算法动态替换排序算法
        Collections.sort(students,new SortComparator());
    }
}
