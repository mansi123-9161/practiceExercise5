package com.stackroute.pe5;
import java.util.*;
import static org.junit.Assert.*;
import org.junit.*;
public class SetSortingTest {
    SetSorting setSorting;
    @Before
    public void setUp() throws Exception {
        setSorting= new SetSorting();
    }

    @After
    public void tearDown() throws Exception {
        setSorting= null;
    }

    @Test
    public void givenSetShouldSortDataAlphabaticaly(){
        //Arrange
        ArrayList<String> list =new ArrayList<String>();
        ArrayList<String> expectedValue =new ArrayList<String>();
        ArrayList<String> actualValue =new ArrayList<String>();

        //Act
        list.add("Harry");
        list.add("Olive");
        list.add("Alice");
        list.add("Bluto");
        list.add("Eugene");
        expectedValue.add("Alice");
        expectedValue.add("Bluto");
        expectedValue.add("Eugene");
        expectedValue.add("Harry");
        expectedValue.add("Olive");
        actualValue = setSorting.setArraySort(list);
        //Assert
        assertArrayEquals(expectedValue.toArray(), actualValue.toArray());
    }
   @Test
   public void givenSetShouldNotSortDataAlphabaticaly(){
       //Arrange
       ArrayList<String> list =new ArrayList<String>();
       ArrayList<String> expectedValue =new ArrayList<String>();
       ArrayList<String> actualValue =new ArrayList<String>();

       //Act
       list.add("Harry");
       list.add("Olive");
       list.add("Alice");
       list.add("Bluto");
       list.add("Eugene");
       expectedValue.add("Alice");
       expectedValue.add("Bluto");
       expectedValue.add("Eugene");
       expectedValue.add("Harry");
       expectedValue.add("Olive");
       actualValue = setSorting.setArraySort(list);
       //Assert
       assertNotEquals(expectedValue.toArray(), actualValue.toArray());
   }

}