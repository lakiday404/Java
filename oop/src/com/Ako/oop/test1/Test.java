package com.Ako.oop.test1;

public class Test {
    public static void main(String[] args){
        // 创建第一个对象来管理第一条狗的信息
        Dog d1=new Dog();
        d1.name="小白";
        d1.age=2;
        d1.weight=3.5;
        d1.color="white";
        System.out.println(d1.name+" "+d1.color+" "+d1.weight+" "+d1.age);



    }
}
