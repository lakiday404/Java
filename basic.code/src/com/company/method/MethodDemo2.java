package com.company.method;

import java.util.Random;

public class MethodDemo2 {
    public static void main(String[] args) {
        // 定义方法，生成十个数的数组，由1-100的随机数构成
        int[] arr = new int[10];
        Random r = new Random();

        for (int i = 0; i < arr.length;) {
            int num = r.nextInt(100) + 1;
            //对num判断，保证不重复

            if (!contains(num, arr)) {
                //符合要求则可以赋值
                arr[i] = num;
                i++;
            }
        }

            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[j] + " ");
            }
            System.out.println();

        }




        public static boolean contains(int num, int[] arr){
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == num) {
                    return true;
                }
            }
            return false;
        }
    }
