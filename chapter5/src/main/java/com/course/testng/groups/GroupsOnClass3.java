package com.course.testng.groups;

import org.testng.annotations.Test;

@Test(groups = "tea")
public class GroupsOnClass3 {

    public void teacher1(){
        System.out.println("GroupOnClass3 tea1");
    }

    public void teacher2(){
        System.out.println("GroupOnClass3 tea2");
    }
}
