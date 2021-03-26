package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestPerson {

    @Test
    public void testConstructor(){
        //Given
        long expectedId = 101;
        String expectedName = "Lena";
        Person lena = new Person (expectedId, expectedName);

        //When
        long actualId = lena.getId();
        String actualName = lena.getName();

        //Then
        Assert.assertEquals(expectedId,actualId);
        Assert.assertEquals(expectedName,actualName);

    }

    @Test
    public void testSetName(){
        //Given
        long lenasId = 101;
        String lenasName = "Lena";
        Person lena = new Person (lenasId, lenasName);

        //When
        String expectedName = "Helen";
        lena.setName("Helen");
        String actualName = lena.getName();

        //Then
        Assert.assertEquals(expectedName,actualName);
    }

}
