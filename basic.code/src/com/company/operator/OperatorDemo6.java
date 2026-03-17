package com.company.operator;
import java.util.Scanner;
public class OperatorDemo6 {
    public static void main(String[] args){
        //键盘输入你和好基友的身高，比比谁更高



        Scanner sc=new Scanner(System.in);
        System.out.println("请输入我的身高：");
        double myHeight=sc.nextDouble();
        System.out.println("请输入你朋友的身高");
        double friendHeight=sc.nextDouble();
        boolean result=myHeight>=friendHeight;
        System.out.println(result);

    }
}
