package com.Ako.oop.test6;

public class Student {
    private String name;
    private int age;
//alt+inert+fn 可以快速构造方法，如果进入页面后双击tab可以快速构造空参方法
    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    //行为
    public void study(){
        System.out.println(name+" is studying");
    }
    public void eat(){
        System.out.println(name+" is eating");
    }
    public void sleep(){
        System.out.println(name+" is sleeping");
    }

}
