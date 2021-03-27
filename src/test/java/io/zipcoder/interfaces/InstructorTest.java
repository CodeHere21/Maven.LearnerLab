package io.zipcoder.interfaces;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

public class InstructorTest {
    @Test
    public void testImplementation(){
        //Given
        Instructor instructorZero = new Instructor(100,"Nobles");

        //When

            //Then
        Assert.assertTrue(instructorZero instanceof Teacher);
        }

    @Test
    public void testInheritance(){
        //Given
        Instructor instructor = new Instructor(100,"Nobles");

        //When

        //Then
        Assert.assertTrue(instructor instanceof Person);
        }

    @Test
    public void testTeach(){
        //Given
        Instructor instructor = new Instructor(100,"Nobles");
        Learner lena = new Student(101, "Lena");
        double numberOfHours = 80;

        //When
        double expected = 80;
        double actual = instructor.teach(lena,80);

        //Then
        Assert.assertEquals(expected,actual,0.01);
    }

    @Test
    public void testLecture() {
        //Given
        Instructor instructor = new Instructor(100,"Nobles");
        Learner lena = new Student(101, "Lena");
        Learner justin = new Student(102, "Justin");
        Learner monali = new Student(103, "Monali");
        Learner ashley = new Student(104, "Ashley");
        Learner[] learners = new Learner[]{lena, justin,monali, ashley};
        double numberOfHours = 400;

        //When
        learners[0]=lena;
        learners[1]=justin;
        learners[2]=monali;
        learners[3]=ashley;
        double expected = 100;
        double actual = instructor.lecture(learners,numberOfHours);
        System.out.println(actual);

        //Then
        Assert.assertEquals(expected, actual, 0.001);
    }
}