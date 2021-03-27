package io.zipcoder.interfaces;

public class Student extends Person implements Learner {
    double totalStudyTime;

    public Student(long id, String name) {
        super(id, name);
    }

    public double learn(double numberOfHours) {
        totalStudyTime +=numberOfHours;
        return totalStudyTime;
    }


    public double getTotalStudyTime() {

        return totalStudyTime;
    }
}
