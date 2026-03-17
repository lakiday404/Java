package com.company.array;

import java.util.Scanner;

public class ArrayDemo12_1 {
    public static void main(String[] args){
        //用二分法处理案例12
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入数组长度：");
        int a = sc.nextInt();
        System.out.println("请输入要找到目标值：");
        int target = sc.nextInt();

        System.out.println("请输入这个数组：");
        int nums[] = new int[a];
        for (int i = 0; i < a; i++) {
            nums[i] = sc.nextInt();
        }

        int left=0;
        int right=a-1;    //索引从0开始，所以右侧-1
        while(left<=right){
            int mid=(left+right)/2;
            if(nums[mid]==target){
                System.out.println(mid);
                return;            /*这里用return，可以防止在数组中有target时，下面left在输出一次。
                                      如果用break，则需要引入boolean found=false*/
            }else if(nums[mid]>target){
                right=mid-1;
            }else if(nums[mid]<target){
                left=mid+1;
            }
        }
        //如果没找到，left正好指向应该插入的位置
        System.out.println(left);
    }
}
