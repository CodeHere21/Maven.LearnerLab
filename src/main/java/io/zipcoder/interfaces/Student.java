package io.zipcoder.interfaces;

public class Student extends Person implements Learner {
    double totalStudyTime = 5;

    public Student(long id, String name) {
        super(id, name);
    }

    public double learn(double numberOfHours) {
        double var = getTotalStudyTime();
        double totalTime = var+numberOfHours;
        return totalTime;
    }


    public double getTotalStudyTime() {

        return totalStudyTime;
    }
}
