package com.company.operator;
import java.util.Scanner;

public class OperatorDemo2 {
//拆分一个三位数，分别输出个位，十位，百位
    public static void main(String[] args){
        Scanner sc= new Scanner (System.in);
        System.out.println("请输入一个三位数：");
        int number=sc.nextInt();

        int ge=number%10;
        System.out.println("个位数是：" +ge);

        int shi=number%100/10;
        System.out.println("十位数是：" +shi);

        int bai=number/100;
        System.out.println("百位数是：" +bai);



    }
}

