package com.company.algorithm;

import java.util.Scanner;

public class AlgorithmDemo1_1 {
    // 不用快慢指针，而是使用新数组来做
    //给定一个数组nums和一个值val，删除所有等于val的元素
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入数组长度：");
        int a=sc.nextInt();
        System.out.println("请输入这个数组：");
        int []nums=new int[a];
        for (int i = 0; i < nums.length; i++) {
            nums[i]=sc.nextInt();
        }
        System.out.println("请输入要删除的值：");
        int val=sc.nextInt();


    }
}
