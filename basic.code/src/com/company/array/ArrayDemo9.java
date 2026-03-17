package com.company.array;

public class ArrayDemo9 {
    //快慢指针，给定一个递增有序数组，去除其中重复元素
    public static void main(String[] args){
        int arr[]={1,1,2,2,2,2,3,3,3,3};
        int slow=0;
        int fast=0;

        while(fast<arr.length){
            //判断两个指针指向的数据是否相同
            if(arr[slow]!=arr[fast]) {
                slow++;
                arr[slow] = arr[fast];
                fast++;
            }
            fast++;

        }
        for (int i = 0; i <=slow; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();


    }
}
