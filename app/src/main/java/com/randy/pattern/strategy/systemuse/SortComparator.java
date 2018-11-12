package com.randy.pattern.strategy.systemuse;

import java.util.Comparator;

/**
 * @author chenming
 * @data 2018/11/12 16:38
 * @filename
 * @describle
 * @email chenming@evergande.com
 */

public class SortComparator implements Comparator<Student> {
    @Override
    public int compare(Student student, Student t1) {
        Student student1 = student;
        Student student2 = t1;
        return student1.getId() - student2.getId();
    }
}
