package com.company.method;

import java.util.Scanner;

public class MethodDemo6 {
    //统计10位学生数学成绩（0-100）
    //计算及格率，平均分，找出最高分
    //要求：键盘录入10名学生的成绩
    //定义方法求及格人数并根据此求及格率
    //定义方法求总分并根据此求平均分
    //定义方法求最大值
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int []arr=new int[10];
        int num=0;
        System.out.println("请输入10位同学的成绩：");
        for (int i = 0; i < arr.length; ) {
            num=sc.nextInt();
            if(num<0||num>100){
                System.out.println("输入不正确请重新输入");
            }
            else{
                arr[i]=num;
                i++;
            }
        }
        System.out.println("及格人数为"+pass(arr)+","+"及格率为"+passRate(arr));
        System.out.println("总分为"+sum(arr)+"平均分为"+aver(arr));
        System.out.println("最高分为:"+Max(arr));
    }
    public static int pass(int arr[]){
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>=60){
                count++;
            }
        }
        return count;
    }
    public static double passRate(int arr[]){
       return pass(arr)*1.0/ arr.length;
    }
    public static int sum(int arr[]){
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }
        return sum;
    }
    public static double aver(int arr[]){
        return sum(arr)*1.0/ arr.length;
    }
    public static int Max(int arr[]){
        int Max=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(Max<arr[i]){
                Max=arr[i];
            }
        }
        return Max;
    }


}

