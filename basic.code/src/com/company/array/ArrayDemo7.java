package com.company.array;

import java.util.Random;

public class ArrayDemo7 {
    //给定数组，随机输出
    public static void main(String[] args){
        int arr[]={1,2,3,4,5,6,7,8,9,10};
        //初始化一个随机数
        Random r=new Random();

        for (int i = 0; i < arr.length; i++) {
            //本质上是进行元素位置的交换，避免重新赋值导致的重复或遗漏
            // randomIndex，意思是随机创建一个索引，范围在数组长度内。
            int randomIndex=r.nextInt(arr.length);

            //temp作为中间量，暂时储存arr[i]的值
            int temp=arr[i];
            //随机的索引把arr[i]替换
            arr[i]=arr[randomIndex];
            //存在temp的arr[i]的值，再交换给随机索引，这一步是避免重复
            arr[randomIndex]=temp;


        }
        for(int i=0;i< arr.length;i++){
            System.out.println(arr[i]);
        }

    }
}
