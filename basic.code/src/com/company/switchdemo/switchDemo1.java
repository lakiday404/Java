package com.company.switchdemo;
import java.util.Scanner;
public class switchDemo1 {
    public static void main(String[] args){

        /*
         键盘录入星期几，显示今天减肥活动
         周一跑步
         周二游泳
         周三慢走
         周四动感单车
         周五拳击
         周六爬山
         周日吃
         */

        Scanner sc=new Scanner(System.in);
        System.out.println("请输入星期几");
        int week=sc.nextInt();
        switch(week){
            case 1:
                System.out.println("跑步");
                break;
            case 2:
                System.out.println("游泳");
                break;
            case 3:
                System.out.println("慢走");
                break;
            case 4:
                System.out.println("动感单车");
                break;
            case 5:
                System.out.println("拳击");
                break;
            case 6:
                System.out.println("爬山");
                break;
            case 7:
                System.out.println("吃");
                break;
            default:
                System.out.println("没有这个星期");
        }


    }
}
