package com.company.controllerloop;
import java.util.Scanner;
public class BreakDemo2 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        //游戏人物，hp不低于1，不高于200，回血与扣血
        int hurt=0;
        //循环+break，一直录入数据直到符合要求为止
        while(true){
            System.out.println("请输入当前人物收到的伤害");
            hurt=sc.nextInt();
            if(hurt>0) break;
            else System.out.println("受到的伤害不能是负数");
        }

        int hp=200;
        hp-=hurt;
        if(hp<=0) hp=1;
        System.out.println("当前游戏人物血量为："+hp);

        int add=0;
        while(true){
            System.out.println("请输入回复的血量为：");
            add=sc.nextInt();
            if(add>0) break;
            else System.out.println("回复的血量不能为负数 ");
        }

        hp=hp+add;
        if(hp>200) hp=200;
        System.out.println("当前任务血量为:"+hp);


    }
}
