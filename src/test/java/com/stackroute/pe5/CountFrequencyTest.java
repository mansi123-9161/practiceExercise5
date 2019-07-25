package com.stackroute.pe5;
import org.junit.*;
import static org.junit.Assert.*;

public class CountFrequencyTest {

    CountFrequency countFrequency;
    @Before
    public void setUp() throws Exception {
        countFrequency=new CountFrequency();
    }

    @After
    public void tearDown() throws Exception {
        countFrequency=null;
    }

    @Test
    public void givenStringShouldReturnTrueOrFalseBasedOnTheirOccurence() {
        String expected="{a : true, b : false, c : true, d : false}";
        String arr[] = {"a","b","c","d","a","c","c"};
        String actual=countFrequency.checkFrequencyOfCharector(String.join(" ",arr)).replaceAll("="," : ");
        assertEquals(expected,actual);
    }

    @Test
    public void checkAppearanceNull() {

        String actual=countFrequency.checkFrequencyOfCharector(null);
        assertNull(actual);

    }

    @Test
    public void givenStringShouldNotReturnTrueOrFalseBasedOnTheirOccurence() {
        String expected="{a : true, b : false, c : true, d : false}";
        String arr[] = {"a","b","c","d","a","c","c","b"};
        String actual=countFrequency.checkFrequencyOfCharector(String.join(" ",arr)).replaceAll("="," : ");
        assertNotEquals(expected,actual);
    }

}