package com.Ako.oop.test6;

public class Test {
    //创建对象
    public static void main(String[] args){
        Student stu1=new Student();
        stu1.setName("Ako");
        stu1.setAge(23);
        System.out.println(stu1.getName());
        System.out.println(stu1.getAge());
        stu1.study();
        stu1.eat();
        stu1.eat();

        Student stu2=new Student("Ako",23);
        System.out.println(stu2.getName());
        System.out.println(stu2.getAge());
        stu2.study();
        stu2.eat();
        stu2.sleep();
    }

}
