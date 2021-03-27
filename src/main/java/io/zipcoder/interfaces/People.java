package io.zipcoder.interfaces;

//import com.sun.org.apache.xpath.internal.operations.Bool;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class People<S extends Person> implements Iterable<S> {
    List<S> personList = new ArrayList<S>();

    public void addPerson(S person){
        personList.add(person);
    }
    public S findById (long id){
        for(S person : personList){
            if(person.getId()==id) {
                return person;
            }
        }
        return null;
    }
    public Boolean contains (S person){
        if (personList.contains(person)){
            return true;
        }
        return false;
    }
    public void remove (S person){
        personList.remove(person);
    }
    public void remove(long id){
        for(S person:personList){
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
    public abstract  S[] toArray();

    public Iterator<S> iterator() {
        return personList.iterator();
    }
}
