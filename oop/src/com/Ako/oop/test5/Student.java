package com.Ako.oop.test5;

public class Student {
    private String name;
    private int age;
    private String gender;
    private  int height;

    //
    public Student(){
        //System.out.println("空参构造方法被调用了");
    }
    public Student(String name,int age,String gender,int height){
        System.out.println("带全部参数的构造被调用了 ");
        this.name=name;
        this.age=age;
        this.gender=gender;
        this.height=height;
    }
    //set/get
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public void setAge(int age){
        this.age=age;
    }
    public int getAge(){
        return age;
    }
    public void setGender(String gender){
        this.gender=gender;
    }
    public String getGender(){
        return gender;
    }
    public void setHeight(int height){
        this.height=height;
    }
    public int getHeight(){
        return height;
    }




}
