package com.Ako.staticvariabletest;

public class Test {
    //静态变量第一个练习
    /*
    学生有如下属性：姓名，年龄，老师；一个班级中老师共享
    第一个学生：小诗诗，19岁
    第二个学生：小丹丹，20岁
    小雯老师上课，后被小丹丹申请更换为阿伟老师

    关于static：
    1.静态变量，被当前类所有对象共享
    共享：赋值只要赋值一次
    只要有一个对象修改了静态变量，其他对象再次访问的时候就是修改之后的结果了
    调用方式：
    1.类名调用
    2.对象名调用
    */
    public static void main(String[] args){
        Student stu1=new Student();
        stu1.name="小诗诗";
        stu1.age=19;
        Student.teacherName="小雯老师";
        //stu1.teacherName="小雯老师"   不推荐用对象名写


        //创建第二个学生对象
        Student stu2=new Student();
        stu2.name="小丹丹";
        stu2.age=20;
        Student.teacherName="阿伟老师";

        System.out.println(stu1.name+", "+stu1.age+", "+Student.teacherName);
        System.out.println(stu2.name+", "+stu2.age+", "+Student.teacherName);

    }



}
