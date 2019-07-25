package com.stackroute.pe5;

import static org.junit.Assert.*;
import java.util.*;
import org.junit.*;
public class StudentDataTest {
    ArrayList<StudentData> arrayList = new ArrayList<StudentData>();

    @Before
    public void setUp() throws Exception {
    }


    @After
    public void tearDown() throws Exception {


    }

    @Test
    public void testStudent() {

        List<StudentData> students = new ArrayList<>();
        StudentData obj1 = new StudentData(1, "A", 27);
        StudentData obj2 = new StudentData(2, "S", 23);
        StudentData obj3 = new StudentData(3, "Si", 37);
        StudentData obj4 = new StudentData(4, "A", 22);
        StudentData obj5 = new StudentData(5, "A", 29);

        students.add(obj1);
        students.add(obj2);
        students.add(obj3);
        students.add(obj4);
        students.add(obj5);




        Collections.sort(students,new SortStudentData());

        // After Sorting

        String expected="[Student{id=3, name='Si', age=37}, Student{id=5, name='A', age=29}, Student{id=1, name='A', age=27}, Student{id=2, name='S', age=23}, Student{id=4, name='A', age=22}]";
        assertEquals(expected, students.toString());


    }

}