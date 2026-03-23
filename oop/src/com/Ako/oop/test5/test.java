package com.Ako.oop.test5;

public class test {
    //定义一个javabean类描述学生
    //属性：姓名年龄身高性别
    //创建对象
    public static void main(String[] args){
        // 空参
        Student s=new Student();
        System.out.println("空参的构造被调用了");
        System.out.println(s.getName());
        System.out.println(s.getAge());
        System.out.println(s.getGender());
        System.out.println(s.getHeight());
        Student ss=new Student("Ako",21,"男",170);
        System.out.println(ss.getName());
        System.out.println(ss.getAge());
        System.out.println(ss.getGender());
        System.out.println(ss.getHeight());
    }

}
