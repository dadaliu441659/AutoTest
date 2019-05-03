package com.course.testng.multithreads;

import org.testng.annotations.Test;

public class multithreadOnXml1 {

    @Test
    public void multiThreadTestOnXml1(){
        System.out.println("222Thread ID" + Thread.currentThread().getId());
    }

    @Test
    public void multiThreadTestOnXml2(){
        System.out.println("2222Thread ID" + Thread.currentThread().getId());
    }

    @Test
    public void multiThreadTestOnXml3(){
        System.out.println("2222Thread ID" + Thread.currentThread().getId());
    }
}
