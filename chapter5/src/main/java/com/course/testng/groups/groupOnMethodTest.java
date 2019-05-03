package com.course.testng.groups;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class groupOnMethodTest {

    @Test(groups = "client")
    public void groupTest1(){
        System.out.println("group test1");
    }

    @Test(groups = "server")
    public void groupTest2(){
        System.out.println("group test2");
    }

    @Test(groups = "client")
    public void groupTest3(){
        System.out.println("group test3");
    }

    @Test(groups = "server")
    public void groupTest4(){
        System.out.println("group test4");
    }

    @BeforeGroups("server")
    public void BeforeServerGroup(){
        System.out.println("Before server group");
    }

    @AfterGroups("server")
    public void AfterServerGroup(){
        System.out.println("After server group");
    }
}
