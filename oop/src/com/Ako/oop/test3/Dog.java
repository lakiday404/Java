package com.Ako.oop.test3;

public class Dog {
    private String name;
    private  int age;

    //get\set,所有私有化的变量都必须有get和set方法
    public void setName(String value){
        //用value接受，再赋值给name
        name=value;
    }
    public String getName(){
        return name;
    }

    public void setAge(int num) {
        if(num>=0&&num<=15){
            age=num;
        }else{
            System.out.println("不合法");
        }
    }
    public int getAge(){
        return age;
    }
    public void eat(){
        System.out.println("years old"+age+" "+name+" is eating the sht");
    }

}
