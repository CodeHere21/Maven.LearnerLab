package io.zipcoder.interfaces;

public enum Educator implements Teacher {
    NOBLES(100,"Nobles"),
    YOUNGER(99, "Younger"),
    DOLIO   (98, "Dolio");

    private Instructor instructor;
    private double timeWorked;

    Educator(long id, String name) {
    this.instructor = new Instructor(id, name);
    }

    public Instructor getInstructor(){
        return instructor;
    }

    @Override
    public double teach(Learner learner, double numberOfHours) {
        instructor.teach(learner, numberOfHours);
        timeWorked+=numberOfHours;
        return timeWorked;
    }

    @Override
    public double lecture(Learner[] learners, double numberOfHours) {
        instructor.lecture(learners,numberOfHours);
        timeWorked+=numberOfHours;
        return timeWorked;
    }

    public void clearTimeWorked(){
        timeWorked = 0;
    }

    public double getTimeWorked(){
        return timeWorked;
    }
}
