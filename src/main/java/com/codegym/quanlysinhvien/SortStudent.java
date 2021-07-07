
package com.codegym.quanlysinhvien;

import java.util.Comparator;


public class SortStudent implements Comparator<Student>{

    @Override
    public int compare(Student o1, Student o2) {
        return o1.getMaSinhVien().compareTo(o2.getMaSinhVien());
    }
    
}
