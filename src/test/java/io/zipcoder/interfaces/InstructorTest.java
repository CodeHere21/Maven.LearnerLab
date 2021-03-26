package io.zipcoder.interfaces;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

public class InstructorTest {
    @Test
    public void testImplementation(){
        //Given
        Instructor instructorZero = new Instructor(101,"Lena");

        //When

            //Then
        Assert.assertTrue(instructorZero instanceof Teacher);
        }

    @Test
    public void testInheritance(){
        //Given
        Instructor instructor = new Instructor(101,"Lena");

        //When

        //Then
        Assert.assertTrue(instructor instanceof Person);
        }

    @Test
    public void testTeach(){
        //Given
        Instructor instructor = new Instructor(101,"Lena");
        Learner lena = new Student(101, "Lena");

        //When

    }

    @Test
    public void testLecture() {
        //Given
        Instructor instructor = new Instructor(101,"Lena");
        Learner lena = new Student(101, "Lena");
        Learner justin = new Student(102, "Justin");
        Learner monali = new Student(103, "Monali");
        Learner ashley = new Student(104, "Ashley");
        Learner[] learners = new Learner[]{lena, justin,monali, ashley};
        double numberOfHours = 400;
        double totalStudyTime = 5; //just to remember that totalStudyTime used in learn()

        //When
        learners[0]=lena;
        learners[1]=justin;
        learners[2]=monali;
        learners[3]=ashley;
        double expected = 105;
        double actual = instructor.lecture(learners,numberOfHours);
        System.out.println(actual);


        //Then
        Assert.assertEquals(expected, actual, 0.001);




    }
}