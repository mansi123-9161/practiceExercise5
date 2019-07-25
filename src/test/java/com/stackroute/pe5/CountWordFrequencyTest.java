package com.stackroute.pe5;
import org.junit.*;
import static org.junit.Assert.*;

public class CountWordFrequencyTest {

   CountWordFrequency countWordFrequency;
    @Before
    public void setUp() throws Exception {
       countWordFrequency=new CountWordFrequency();
    }

    @After
    public void tearDown() throws Exception {
        countWordFrequency=null;
    }

    @Test
    public void givenStringShouldReturnFrequencyOfEachWord() {
        String expected="{one=5, two=2, three=2}";
        String actual=countWordFrequency.checkFrequency("one one -one___two,,three,one @three*one?two");
        assertEquals(expected,actual);
    }
    @Test
    public void givenStringShouldNotReturnFrequencyOfEachWord() {
        String expected="{one=5, two=2, three=2}";
        String actual=countWordFrequency.checkFrequency("one one one -one___two,,three,one @three*one?two");
        assertNotEquals(expected,actual);
    }

    @Test
    public void givenStringShouldReturnNull() {

        String actual=countWordFrequency.checkFrequency(null);
        assertNull(actual);
    }
    @Test
    public void givenStringShouldReturnNotNull() {

        String actual=countWordFrequency.checkFrequency("i am Batman");
        assertNotNull(actual);
    }

}