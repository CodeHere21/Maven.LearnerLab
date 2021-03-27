package io.zipcoder.interfaces;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class ZipCodeWilmington {
    private  Students students = Students.getInstance();
    private Instructors instructors = Instructors.getInstance();

    public void hostLecture (Teacher teacher, double numberOfHours){
        teacher.lecture(students.getArray(),numberOfHours);
    }
    public void hostLecture(long id, double numberOfHours){
        Instructor hostInstructor = instructors.findById(id);
       hostInstructor.lecture(students.getArray(),numberOfHours);
    }
    public Map<Student, Double> getStudyMap(){
        Map<Student, Double> map = new LinkedHashMap<Student, Double>();
        for (Student student:students){
            map.put(student,student.getTotalStudyTime());
        }
        return map;

        }
    }
