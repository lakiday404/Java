package com.company.method;
import java.util.Scanner;
public class MethodDemo5 {
    //五个评委打分，1-100之间。最终得分去掉最高和最低，剩余的分数求平均数
    //要求：键盘录入5个整数存入数组，如果不在范围内需要重新录入
    //定义方法求最大值和最小值
    //计算五名评委的总分
    //总分-最大-最小再求平均数为最终平均分
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int sum=0;
        System.out.println("请输入这个数组：");
        int []arr=new int[5];
        for (int i = 0; i < arr.length;) {
           int num=sc.nextInt();
            if(num<=0||num>=100){
                System.out.println("输入不合法，请重新输入:");
            }else {
                arr[i]=num;
                sum += arr[i];
                i++;
            }
        }

        System.out.println("最大值为"+Max(arr));
        System.out.println("最小值为"+Min(arr));
        int originsun=sum;
        sum=sum-Max(arr)-Min(arr);
        System.out.println("总分为"+originsun+"，最终平均分为"+sum/3);

    }
    public static int Max(int []arr){
        int Max=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(Max<arr[i]){
                Max=arr[i];
            }
        }
        return Max;
    }
    public static int Min(int []arr){
        int Min=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(Min>arr[i]){
                Min=arr[i];
            }
        }
        return Min;
    }
}
