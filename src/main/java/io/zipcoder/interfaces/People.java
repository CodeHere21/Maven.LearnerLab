package io.zipcoder.interfaces;

//import com.sun.org.apache.xpath.internal.operations.Bool;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class People {
    List<Person> personList = new ArrayList<Person>();

    public void addPerson(Person person){
        personList.add(person);
    }

    public Person findById (long id){
        for(Person person : personList){
            if(person.getId()==id) {
                return person;
            }
        }
        return null;
    }
    public Boolean contains (Person person){
        if (personList.contains(person)){
            return true;
        }
        return false;
    }
    public void remove (Person person){
        personList.remove(person);
    }
    public void remove(long id){
        for(Person person:personList){
            if(person.getId()==id){
                personList.remove(person);
            }
        }
    }
    public void removeAll(){
        personList.removeAll(personList);
    }
    public int count(){
       return personList.size();
    }
    public Object[] toArray(){
        Object[] result=personList.toArray();
        return result;
    }
}
