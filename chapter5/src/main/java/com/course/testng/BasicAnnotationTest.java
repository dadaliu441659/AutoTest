package com.course.testng;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BasicAnnotationTest {

    @Test
    public void annotationTest1(){
        System.out.println("this is test1");
    }

    @Test
    public void annotationTest2(){
        System.out.println("this is test2");
    }


    @BeforeMethod
    public void beforeMethodtest(){
        System.out.println("this is before method");
    }

    @AfterMethod
    public void afterMethod(){
        System.out.println("this is after method");
    }
}
