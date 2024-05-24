package classwork28;

import homework11.Random;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

public class Test01 {
    @BeforeAll
    public static void beforeAllMethod () {
        System.out.println("This code executes before all the tests");
    }


    @Test
    @Disabled
    public void  test () {
        assertTrue (2 >1);
    }

    @Test
    @DisplayName("Test for null reference")
    public void testNull()  {
        Random random = null;
        assertNull(random);
    }
    @Test
    public void testEquals () {
        String s1 = "111";
        String s2 = "222";
        String res = s1 + s2;

        int expected = 6;
        int actual = res.length();
        assertEquals(expected, actual);

    }

    @Test
    public void testStrings (){
        String s= "";
        assumeTrue (s.length() !=0);
        s +="Hello";
        assertTrue(s.length()>0);

    }



}
