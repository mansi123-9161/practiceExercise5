package com.stackroute.pe5;

import static org.junit.Assert.*;
import java.util.ArrayList;
import org.junit.*;

public class PrintArrayListTest {

    PrintArrayList printArrayList;

    @Before
    public void setUp() throws Exception {
       printArrayList= new PrintArrayList();
    }

    @After
    public void tearDown() throws Exception {
        printArrayList= null;
    }

    @Test
    public void givenArrayListShouldPrintUpdatedValue(){


        ArrayList<String> Expected= new ArrayList<String>();
        Expected.add("Kiwi");
        Expected.add("Grape");
        Expected.add("Mango");
        Expected.add("Berry");

        ArrayList<String> arrayList= new ArrayList<String>();
        arrayList.add("Apple");
        arrayList.add("Grape");
        arrayList.add("Melon");
        arrayList.add("Berry");

        ArrayList actual= printArrayList.printUpdatedArrayList(arrayList);
        assertEquals(Expected,actual);



    }
    @Test
    public void givenArrayListShouldNotBeNull(){


        ArrayList<String> arrayList= new ArrayList<String>();
        arrayList.add("Apple");
        arrayList.add("Grape");
        arrayList.add("Melon");
        arrayList.add("Berry");

        assertNotNull(printArrayList);

    }

    @Test
    public void givenArrayListShouldNotPrintUpdatedValue(){


        ArrayList<String> Expected= new ArrayList<String>();
        Expected.add("Kiwi");
        Expected.add("Grape");
        Expected.add("Mango");
        Expected.add("Berry");

        ArrayList<String> arrayList= new ArrayList<String>();
        arrayList.add("Apple");
        arrayList.add("Grape");
        arrayList.add("Melon");
        arrayList.add("Berry");

        ArrayList actual= printArrayList.printUpdatedArrayList(arrayList);
        assertNotEquals("please enter correct list value",Expected,actual);

    }


    @Test
    public void givenArrayListShouldReturnEmptyList()  {


        ArrayList<String> Expected= new ArrayList<String>();

        ArrayList<String> arrayList= new ArrayList<String>();
        arrayList.add("Apple");
        arrayList.add("Grape");
        arrayList.add("Melon");
        arrayList.add("Berry");

        ArrayList actual= printArrayList.clearThePrintedArrayList(arrayList);
        assertEquals(Expected,actual);


    }

}