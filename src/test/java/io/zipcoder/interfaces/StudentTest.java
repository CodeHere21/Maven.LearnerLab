package io.zipcoder.interfaces;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

public class StudentTest {
    @Test
    public void testImplementation(){
        //Given
        Student studentZero = new Student(101,"Lena");

        //When

        //Then
        Assert.assertTrue(studentZero instanceof Learner);
    }
    @Test
    public void testInheritance(){
        //Given
        Student studentZero = new Student(101,"Lena");

        //When

        //Then
        Assert.assertTrue(studentZero instanceof Person);
    }

    @Test
    public void testLearn() {
        //Given
        Student studentZero = new Student(101,"Lena");
        double numberOfHours = 80;

        //When
        double expectedTotalTime = 85;
        double actualTotalTime = studentZero.learn(numberOfHours);

        //Then
        Assert.assertEquals(expectedTotalTime, actualTotalTime, 0.001);

    }


}