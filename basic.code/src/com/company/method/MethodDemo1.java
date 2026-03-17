package com.company.method;

import java.util.Scanner;


public class MethodDemo1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int add = getSum(a, b);

        System.out.println(add);
    }

    public static int getSum(int a, int b) {
        int sum = a + b;
        return sum;
    }
}