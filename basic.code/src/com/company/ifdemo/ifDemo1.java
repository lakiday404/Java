package com.company.ifdemo;
import java.util.Scanner;
public class ifDemo1 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入你的体温");
        Double bodyTemperature=sc.nextDouble();

        /*if(bodyTemperature>=38){
            System.out.println("语音警告");
        }*/

        //if里边只有一个语句，可以不写大括号
        if(bodyTemperature>=38) System.out.println("语音警告");

    }

}


