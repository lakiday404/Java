package com.company.loopwhile;
import java.util.Scanner;
public class whileDemo3 {
    public static void main(String[] args){
        //给定一个整数n，计算所有数位之和，若n为负数则先取其绝对值
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个整数n");
        int n=sc.nextInt();

        if(n<0) n=-n;
        /*
        //输出每一位数字的写法

        int count=0;
        int replace=n;
        while(replace!=0){
            replace=replace/10;
            count++;
        }
        System.out.println("这是一个"+count+"位数");
//构造一个除数，方便分割出每个位的数字
        int divisor=1;
        for(int i=0;i<count-1;i++){
            divisor*=10;
        }
        int temp=n;
        System.out.println("各位数字分别为：");
        while(divisor!=0){
            int digit=temp/divisor; //取出最高位
            System.out.print(digit+" ");  //print不换行，各位数字写在同一行
            temp%=divisor;          //去掉最高位
            divisor/=10;         //除数缩小10倍
        }
        System.out.println();   //println换行，和sum分隔开

        int sum=0;
        temp=n;
        while(temp!=0){
            sum+=temp%10;
            temp/=10;
        }
        System.out.println("各位的数的和为"+sum);*/

        int sum=0;
        while(n!=0){
            sum+=(n%10);
            n/=10;
        }
        System.out.println(sum);





    }

}
