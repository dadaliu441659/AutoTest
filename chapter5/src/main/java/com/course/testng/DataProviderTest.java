package com.course.testng;

import javafx.scene.chart.PieChart;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

public class DataProviderTest {


    @Test(dataProvider = "data")
    public void testDataProvider(String name, String age){
        System.out.println("name: " + name + "  age: " + age);
    }

    @DataProvider(name="data")
    public Object[][] DataProvider(){
        Object[][] o = new Object[][]{
                {"zhangsan1111","20"},
                {"lisi111","30"}
        };

        return o;
    }


    @Test(dataProvider="methodData")
    public void testMethod1(String name, String age){
        System.out.println("name: " + name + "  age: " + age);
    }

    @Test(dataProvider = "methodData")
    public void testMethod2(String name, String age){
        System.out.println("name: " + name + "  age: " + age);
    }

    @DataProvider(name="methodData")
    public Object[][] DataProvider1(Method method){
        Object[][] result = null;
        if(method.getName().equals("testMethod1")){
            result= new  Object[][]{
                    {"zhangsan","10"},
                    {"lisi","20"}
            };
        } else if(method.getName().equals("testMethod2")){
            result =new Object[][]{
                    {"wangwu","60"}
            };
        }
        return result;

    }


}
