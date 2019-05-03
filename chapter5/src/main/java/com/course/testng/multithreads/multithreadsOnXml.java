package com.course.testng.multithreads;

import org.testng.annotations.Test;

public class multithreadsOnXml {

    @Test
    public void multiThreadTestOnXml1(){
        System.out.println("1111Thread ID" + Thread.currentThread().getId());
    }

    @Test
    public void multiThreadTestOnXml2(){
        System.out.println("1111Thread ID" + Thread.currentThread().getId());
    }

    @Test
    public void multiThreadTestOnXml3(){
        System.out.println("1111Thread ID" + Thread.currentThread().getId());
    }

}
