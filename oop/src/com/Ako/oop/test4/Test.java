package com.Ako.oop.test4;

public class Test {
    public static void main(String[] args){
        cook c=new cook();

        c.name="Ako";
        c.age=21;
        c.cookLevel=10;
        System.out.println(c.name+" "+c.cookLevel+" "+c.age);
        c.cooking();
    }
}
