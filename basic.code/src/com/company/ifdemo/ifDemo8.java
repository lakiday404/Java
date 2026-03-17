package com.company.ifdemo;
import java.util.Scanner;
public class ifDemo8 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入你的身高：(单位为m)");
        double height=sc.nextDouble();
        System.out.println("请输入你的体重：（单位为kg）");
        double weight=sc.nextDouble();

        double BMI=weight/(height*height);
        if(BMI>0){
            if(BMI<18.5) System.out.println("您的BMI指数为"+BMI+"，您的身体状态为消瘦，您的健康风险部分增加");
            else if(BMI>=18.5&&BMI<=23.9) System.out.println("您的BMI指数为"+BMI+"，您的身体状态为正常，您的健康风险为正常");
            else if(BMI>=24.0&&BMI<=26.9) System.out.println("您的BMI指数为\"+BMI+\"，您的身体状态为偏胖，您的健康风险为增加");
            else if(BMI>=27.0&&BMI<=29.9) System.out.println("您的BMI指数为\"+BMI+\"，您的身体状态为肥胖，您的健康风险为中度增加");
            else if(BMI>=30) System.out.println("您的BMI指数为\"+BMI+\"，您的身体状态为严重肥胖，您的健康风险为严重增加");
    }else System.out.println("输入不合法");

    }
}
