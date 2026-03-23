package com.Ako.toolclasstest;

public class ArrayUtil {
    //工具类都要用static，并且私有化构造方法，不让外界创建对象
    private ArrayUtil(){}
    public static String printArr(int []arr){

        /*
        System.out.println("[");
        for (int i = 0; i < arr.length; i++) {
            if(i==arr.length-1){
                System.out.println(arr[i]+"]");
            }else{
                System.out.println(arr[i]+", ");
            }
        }
        */

        String result="[";
        for (int i = 0; i < arr.length; i++) {
            if(i==arr.length-1){
                result+=arr[i]+"]";
            }else{
                result+=arr[i]+", ";
            }
        }
        return result;
    }

    public static double getAverage(int[]arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum * 1.0 / arr.length;
    }

}
