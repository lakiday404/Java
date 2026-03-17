package com.company.array;
import java.util.Scanner;
public class ArrayDemo10 {
    public static void main(String[] args){
        //给定一个整数数组nums和一个整数目标值target
        // 请在数组中找到和为目标值target的两个整数并输出其数组索引
        //要求输出所有满足要求的结果
        Scanner sc=new Scanner(System.in);

        System.out.println("请输入数组长度：");
        int a=sc.nextInt();
        System.out.println("请输入要找到目标值：");
        int target=sc.nextInt();


        System.out.println("请输入这个数组：");
        int nums[]=new int[a];
        for (int i = 0; i < a; i++) {
            nums[i]= sc.nextInt();
        }
        int count=0;
        for (int i = 0; i < a; i++) {
            for(int j=i+1;j<a;j++){
                if(nums[i]+nums[j]==target){
                    System.out.println(nums[i]+"+"+nums[j]+"="+target);
                    System.out.println("索引为"+i+","+j);
                    count++;
                }
            }
        }

        if(count==0){
            System.out.println("未找到满足条件的两个数");
        }else{
            System.out.println("共找到"+count+"对满足条件的数字");
        }
    }
}
