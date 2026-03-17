package com.company.algorithm;

import java.util.Scanner;

public class AlgorithmDemo1 {
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
        int newLength=Delete(nums,val);
        System.out.print("nums=[");
        for (int i = 0; i < newLength; i++) {
            System.out.print(nums[i]);
            if(i<newLength-1){
                System.out.print(",");
            }
        }
        System.out.print("]");
        System.out.print(",剩余"+newLength+"个元素");


    }
    /*这段代码的快慢指针逻辑没错，不过不符合题意
    题目要求双指针从两端向中间移动
    public static int Delete(int nums[],int val){
        int slow=0;
        for(int fast=0;fast< nums.length;fast++) {
            //快指针遍历数组，遇到不等于val的元素就赋给慢指针位置
            //slow 指向下一个要放置元素的位置
            if(nums[fast]!=val) {
                nums[slow] = nums[fast];
                slow++;
            }
        }
            return slow;
        }*/
    // ... existing code ...


    //两端向中间移动的双指针
    public static int Delete(int nums[],int val){
        int left = 0;
        int right = nums.length - 1;

        while(left <= right){
            if(nums[left] == val){
                nums[left] = nums[right];
                right--;
            }else{
                left++;
            }
        }
        return left;
    }
// ... existing code ...





}

