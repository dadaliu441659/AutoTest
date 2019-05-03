package com.course.testng.groups;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

@Test(groups="stu")
public class GroupOnClass1 {

    public void stu1(){
        System.out.println("GroupOnClass1 stu1");
    }

    public void stu2(){
        System.out.println("GroupOnClass1 stu2");
    }

    @BeforeGroups("stu")
    public void beforeGroupStu(){
        System.out.println("before group stu");
    }

    @AfterGroups("stu")
    public void afterGroupStu(){
        System.out.println("after group stu");
    }
}
