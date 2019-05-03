package com.course.testng.multithreads;

import org.testng.annotations.Test;

public class multithreadsOnAnnotations {

    @Test(invocationCount=10, threadPoolSize = 10)
    public void testmultiThread(){
        System.out.println(1);
        System.out.println("Thread ID" + Thread.currentThread().getId());

    }
}
