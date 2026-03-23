package com.Ako.toolclasstest;

public class Test {
    public static void main(String[] args){

        int []arr={10,20,30,40,50};
        String res = ArrayUtil.printArr(arr);
        System.out.println(res);

        int []arr2={1,2,3,4,6};
        double avg = ArrayUtil.getAverage(arr2);
        System.out.println(avg);

    }
}
