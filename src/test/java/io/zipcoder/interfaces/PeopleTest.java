package io.zipcoder.interfaces;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class PeopleTest {
    @Test
    public void testAddPerson() {
        //Given
        People people = new People();
        Person lena = new Person(101,"Lena");
        Person monali = new Person(102,"Monali");
        //When
        people.addPerson(lena);
        people.addPerson(monali);

        //Then
        Assert.assertTrue(people.count()==2);

    }

    @Test
    public void testFindById() {
        //Given
        People people = new People();
        Person lena = new Person(101,"Lena");
        Person monali = new Person(102,"Monali");

        //When
        people.addPerson(lena);
        people.addPerson(monali);
        Person expected =monali;
        Person actual=people.findById(102);

        //Then
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void testRemove() {
        //Given
        People people = new People();
        Person lena = new Person(101,"Lena");
        Person monali = new Person(102,"Monali");
        //When
        people.addPerson(lena);
        people.addPerson(monali);
        people.remove(monali);

        //Then
        Assert.assertTrue(people.count()==1);

    }
}