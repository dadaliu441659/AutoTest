package com.extent;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class testExtentReport {

    @Test
    public void test1(){
        Assert.assertEquals(1,1, "test1");
    }

    @Test
    public void test2(){
        Assert.assertEquals(1,2,"test2");
    }

    @Test
    public void test3(){
        Assert.assertEquals(2,2,"test3");
    }

    @Test
    public void test4(){
        Reporter.log("this is my extent report test");
        throw new RuntimeException("this is exception by myself");
    }
}
