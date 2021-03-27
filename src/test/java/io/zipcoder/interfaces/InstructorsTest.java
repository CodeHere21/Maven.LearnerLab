package io.zipcoder.interfaces;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

public class InstructorsTest{
    @Test
    public void testGetInstance() {
        //Given
        Instructors instructor =Instructors.getInstance();

        //When
        int expected = 3;
        int actual=instructor.count();

        //Then
        Assert.assertEquals(expected,actual);
    }
}