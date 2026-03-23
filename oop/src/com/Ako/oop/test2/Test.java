package com.Ako.oop.test2;



public class Test {
    public static void  main(String[] args){
        Teacher t=new Teacher();
        t.name="Ako";
        t.age=21;
        System.out.println(t.name);
        System.out.println(t.age);

        t.teach();
        t.eat();
        t.sleep();
    }
}
