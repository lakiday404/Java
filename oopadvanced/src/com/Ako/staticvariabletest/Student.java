package com.Ako.staticvariabletest;

public class Student {

    String name;
    int age;
    //共享的才加static,此处的teacherName赋值一次就可以
    static String teacherName;
}
