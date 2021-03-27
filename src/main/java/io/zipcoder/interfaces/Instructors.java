package io.zipcoder.interfaces;

import java.util.Spliterator;
import java.util.function.Consumer;

public class Instructors extends People<Instructor> {
    private static final Instructors INSTANCE  = new Instructors();

    Instructors(){
        addPerson(new Instructor(100, "Nobles"));
        addPerson(new Instructor(99, "Younger"));
        addPerson(new Instructor(98,"Dolio"));
    }
    public static Instructors getInstance(){
        return INSTANCE;
    }

    @Override
    public Instructor[] toArray() {
        return new Instructor[0];
    }
}
