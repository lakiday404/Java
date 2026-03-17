package com.company.operator.test;
import java.util.Scanner;
public class timetransform {
    public static void main(String[] args){
        Scanner sc=new Scanner (System.in);
        System.out.println("请输入秒数");
        //定义变量记录秒数，由用户从键盘输入
        int seconds=sc.nextInt();
        //计算时钟，分钟
        int hours=seconds/(60*60);

        //分钟的计算，秒数减去时钟，再除以60；或者秒数对3600取余数再除以60
        //int minutes=(seconds-hours*60*60)/60;
        int minutes=seconds%3600/60;


        seconds=seconds-hours*60*60-minutes*60;
        System.out.println("转换结果为：");
        System.out.println(hours+"小时"+minutes+"分"+seconds+"秒");



    }

}
