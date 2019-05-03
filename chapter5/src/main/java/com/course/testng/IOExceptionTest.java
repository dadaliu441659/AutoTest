package com.course.testng;

import org.testng.annotations.Test;

public class IOExceptionTest {



    @Test(expectedExceptions = RuntimeException.class)
    public void IOExceptionTest1(){
        System.out.println("this is a failed exception test");
    }

    @Test(expectedExceptions = RuntimeException.class)
    public void IOExceptionTest2(){
        System.out.println("this is a successful exception test");
        throw new RuntimeException();
    }
}
