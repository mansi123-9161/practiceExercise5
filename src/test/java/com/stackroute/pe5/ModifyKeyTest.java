package com.stackroute.pe5;

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;
public class ModifyKeyTest {
    ModifyKey modifyKey;
    @Before
    public void setUp() throws Exception {
        modifyKey= new ModifyKey();
    }

    @After
    public void tearDown() throws Exception {
        modifyKey=null;
    }

    @Test
    public void givenMapShouldModifyValueOfKey() {
        Map<String,String> map =new HashMap<String, String>();
        Map<String,String> expectedValue =new HashMap<String, String>();
        Map<String,String> actualValue =new HashMap<String, String>();

        //Act
        map.put("value1","j");
        map.put("value2","c");
        expectedValue.put("value1"," ");
        expectedValue.put("value2","j");

        actualValue = modifyKey.modifyKeyAndValue(map);
        //Assert
        Assert.assertEquals(expectedValue, actualValue);
    }
    @Test
    public void givenMapShouldNotModifyValueOfKey() {
        Map<String,String> map =new HashMap<String, String>();
        Map<String,String> expectedValue =new HashMap<String, String>();
        Map<String,String> actualValue =new HashMap<String, String>();

        //Act
        map.put("val1","mars");
        map.put("val2","saturn");
        expectedValue.put("val1"," ");
        expectedValue.put("val2","saturn");

        actualValue = modifyKey.modifyKeyAndValue(map);
        //Assert
        Assert.assertNotEquals(expectedValue, actualValue);
    }
   @Test
    public void givenMapShouldNotBeNull()
   {
       Map<String,String> map=new HashMap<>();
       Map<String,String> expectedValue =new HashMap<String, String>();
       Map<String,String> actualValue =new HashMap<String, String>();

       //Act
       map.put("val1","mars");
       map.put("val2","saturn");
       expectedValue.put("val1"," ");
       expectedValue.put("val2","saturn");

       actualValue = modifyKey.modifyKeyAndValue(map);
       //Assert
       Assert.assertNotNull( actualValue);
   }
}