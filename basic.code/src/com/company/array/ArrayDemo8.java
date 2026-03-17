package com.company.array;

import javax.sound.midi.SoundbankResource;
import java.util.Random;

public class ArrayDemo8 {
    public static void main(String[] args){
        //获取10个1-100的随机数存入数组中，数据必须唯一
        int arr[]=new int[10];
        Random r=new Random();
        boolean flag=false;

        for (int i = 0; i < 10; i++) {
            int num=r.nextInt(100)+1;
            //对num判断，保证不重复
            for (int j = 0; j < arr.length; j++) {
                if(num==arr[j]){
                    //如果重复则break跳出去
                    flag=true;
                    break;
                }
            }
            if(!flag){
                //符合要求则可以赋值
              arr[i]=num;
              break;
            }
        }
        for(int i=0;i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

    }
}
