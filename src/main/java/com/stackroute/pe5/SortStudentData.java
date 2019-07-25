package com.stackroute.pe5;

import java.util.Comparator;

public class SortStudentData implements Comparator<StudentData> {

    @Override
    public int compare(StudentData studentData, StudentData t1) {
        if (studentData.getAge() == t1.getAge()) {
            if (studentData.getName().equals(t1.getName()))
                return t1.getId() - studentData.getId();
            else
                return t1.getName().compareTo(studentData.getName());
        } else
            {
            return t1.getAge() - studentData.getAge();
        }
    }
}
