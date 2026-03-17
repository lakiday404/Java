package com.company.operator;
import java.util.Scanner;
public class OperatorDemo1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("请输入你的身高：");
        double weight=sc.nextDouble();
        System.out.println("请输入你的体重：");
        double height=sc.nextDouble();

        double BMI=weight/(height*height);
        System.out.println(BMI);

    }
}
