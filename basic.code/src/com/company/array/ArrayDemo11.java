package com.company.array;
import java.util.Scanner;
public class ArrayDemo11 {
    public static void main(String[] args){
        //给定两个有序数组arr1和arr2
        //将两个数组中的数据合并到一个大数组中
        //要求合并之后的大数组也是有序的
        Scanner sc=new Scanner(System.in);

        System.out.println("请输入第1个数组的长度");
        int length1=sc.nextInt();
        System.out.println("请输入这个数组：");
        int nums1[]=new int[length1];
        for (int i = 0; i < length1; i++) {
            nums1[i]= sc.nextInt();
        }

        System.out.println("请输入第2个数组的长度");
        int length2=sc.nextInt();
        System.out.println("请输入这个数组");
        int nums2[]=new int[length2];
        for (int i = 0; i < length2; i++) {
            nums2[i]=sc.nextInt();
        }


        int length3=length1+length2;
        int nums3[]=new int[length3];

        int i=0,j=0,k=0;
        while(i<length1&&j<length2){
            if(nums1[i]<=nums2[j]){
                nums3[k++]=nums1[i++];
            }else{
                nums3[k++]=nums2[j++];
            }
        }
        //处理剩下的元素
        //nums1，nums2经历了上面的while之后，i和j的值随之改变了
        //判断剩下的i是否<length1，即是否遍历完了
        while(i<length1){
            //将剩下的元素直接添加进nums3中
            nums3[k++]=nums1[i++];
        }
        //nums2同理
        while(j<length2){
            nums3[k++]=nums2[j++];
        }

        System.out.println("合并后的数组为：");

        /*for (数据类型 变量名 : 要遍历的数组或集合) {
               循环体
        }*/

        for(int num:nums3){
            System.out.print(num+" ");
        }

    }
}
