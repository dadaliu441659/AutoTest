package com.course.testng;

import org.testng.annotations.Test;

public class ignoreTest {

    @Test
    public void ignoreTest(){
        System.out.println("ignore test1");
    }


    @Test(enabled=false)
    public void ignoreTest1(){
        System.out.println("ignore test2");
    }

}
