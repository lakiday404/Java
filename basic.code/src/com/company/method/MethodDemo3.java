package com.company.method;

import javax.sound.midi.SoundbankResource;

public class MethodDemo3 {
    //定义一个方法输出数组[1,2,3,4,5]
    public static void main(String[] args){
        int[]arr={1,2,3,4,5};
        printArr(arr);
    }

    //没有返回值的方法 用void表示
    public static void printArr(int[]arr){
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if(i== arr.length-1){
                System.out.print(arr[i]);
            }else{
                System.out.print(arr[i]+", ");
            }

        }
        System.out.print("]");
    }


}
