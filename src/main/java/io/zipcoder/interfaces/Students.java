package io.zipcoder.interfaces;

import java.util.List;

public class Students extends People<Student> {
    private static final Students INSTANCE = new Students();

    Students(){
        addPerson(new Student(101, "Lena"));
        addPerson(new Student(102, "Monali"));
        addPerson(new Student(103,"Xiong"));
        addPerson(new Student(104,"Mike"));
    }

    public static Students getInstance(){
        return INSTANCE;
    }

    public Student[] getArray(){
        List<Student> studentList = this.personList;
        Student[] studentArray= new Student[studentList.size()];
        for(int i=0; i<studentList.size();i++){
            studentArray[i] = studentList.get(i);
        }
    return studentArray;
    }

    @Override
    public Student[] toArray() {
        return new Student[0];
    }
}