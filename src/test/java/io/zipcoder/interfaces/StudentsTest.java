package io.zipcoder.interfaces;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

public class StudentsTest extends TestCase {

    @Test
    public void testGetInstance() {
        //Given
        Students student =Students.getInstance();

        //When
        int expected = 4;
        int actual=student.count();

        //Then
        Assert.assertEquals(expected,actual);

    }
}