package com.company.array;
import java.util.Scanner;
public class ArrayDemo5 {
    public static void main(String[] args){
        //已知数组元素为{33,5,22,44,55,33}，键盘录入一个数据
        //查找这个数据是否存在，存在则打印索引，不存在提示该数据不存在
        Scanner sc=new Scanner(System.in);
        int arr[]={33,5,22,44,55,33};
        System.out.println("请输入查找的数据");
        int num=sc.nextInt();
        boolean found=false;

        for (int i = 0; i < arr.length; i++) {
            if(num==arr[i]){
                System.out.println("数据"+num+"在该数组中存在，索引为"+i);
                found=true;
                break;
            }
        }
        if(!found){
            System.out.println("该数据不存在");
        }

    }
}
