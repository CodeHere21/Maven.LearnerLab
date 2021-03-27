package io.zipcoder.interfaces;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

public class ZipCodeWilmingtonTest {
    @Test
    public void testHostLecture() {
        //Given:
        ZipCodeWilmington zipCodeWilmington = new ZipCodeWilmington();
        //When
        zipCodeWilmington.hostLecture(101, 80);
        Double totalStudyTime = Students.getInstance().findById(101).getTotalStudyTime();

        //Then
        Assert.assertEquals(20, totalStudyTime, 0.01);
    }

    @Test
    public void testTestHostLecture() {
    }
}