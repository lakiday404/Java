package com.company.switchdemo;
import java.util.Scanner;
public class switchDemo2 {
    public static void main(String[] args){
        //switch语句，输入月份判断季节
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入当前月份");
        int month=sc.nextInt();
        /*
        switch(month){
            case 1:
            case 2:
            case 12:
                   System.out.println("winter");
                  break;
            case 3:
            case 4:
            case 5:
                  System.out.println("spring");
                  break;
            case 6:
            case 7:
            case 8:
                  System.out.println("summer");
                  break;
            case 9:
            case 10:
            case 11:
                  System.out.println("autumn");
                   break;
            default:
                System.out.println("没有这个季节");
                break;
        }*/

        switch(month){
            case 1,2,12 ->System.out.println("winter");
            case 3,4,5 ->System.out.println("spring");
            case 6,7,8 ->System.out.println("summer");
            case 9,10,11 ->System.out.println("autumn");
            default ->System.out.println("default");

        }
    }
}
