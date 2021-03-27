package io.zipcoder.interfaces;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

public class EducatorTest {
    @Test
    public void testImplementation(){
        Educator educatorZero=Educator.NOBLES;

        Assert.assertTrue(educatorZero instanceof Teacher);
    }
    @Test
    public void testInheritance(){
        Educator educatorZero=Educator.NOBLES;

        Assert.assertTrue(Educator.NOBLES.getInstructor() instanceof Person);
    }

    @Test
    public void testTeach() {
        //Given
        Educator educatorZero = Educator.NOBLES;
        Student lena = new Student(101, "Lena");

        //When
        educatorZero.teach(lena, 20);

        //Then
        Assert.assertEquals(20, lena.getTotalStudyTime(), 0.001);
    }

    @Test
    public void testLecture() {
        //Given
        Educator educatorZero = Educator.NOBLES;
        Student lena = new Student(101,"Lena");
        Student monali = new Student(102, "Monali");
        Student[] zipCode = new Student[]{lena, monali};
        //When
        educatorZero.lecture(zipCode,100);
        //Then
        Assert.assertEquals(50,lena.getTotalStudyTime(),0.001);

    }
}