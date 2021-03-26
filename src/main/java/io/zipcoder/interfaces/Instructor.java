package io.zipcoder.interfaces;

public class Instructor extends Person implements Teacher{
    public Instructor(long id, String name) {
        super(id, name);
    }

    public double teach(Learner learner, double numberOfHours) {
        double result = learner.learn(numberOfHours);

        return result;
    }

    public double lecture(Learner[] learners, double numberOfHours) {
        double numberOfHoursPerLearner = numberOfHours / learners.length;
        double result = 0;
        for (Learner learner : learners) {
            result = learner.learn(numberOfHoursPerLearner);
        }
        return result;
    }
}
