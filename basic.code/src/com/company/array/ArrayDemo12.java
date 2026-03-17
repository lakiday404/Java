package com.company.array;
import java.net.PortUnreachableException;
import java.util.Scanner;
public class ArrayDemo12 {
    public static void main(String[] args) {
        // 给定一个递增的有序数组和一个目标值，在数组中找到目标值并打印其索引
        //如果目标值不存在于数组中，打印应插入的位置
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

        boolean found = false;
        for (int i = 0; i < a; i++) {
            if (target == nums[i]) {
                System.out.println(i);
                found = true;
                break;
            }
            if(target<nums[i]){
                System.out.println(i);
                found=true;
                break;
            }
        }
        if(!found){
            System.out.println(a);

        }
    }
}
