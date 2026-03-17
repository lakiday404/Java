package com.company.looploop;

import java.util.Scanner;

public class Rhombus {
    // 打印一个菱形
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0;

        // 读取并校验输入
        while (true) {
            System.out.println("请输入一个奇数作为菱形行数：");
            n = sc.nextInt();

            if (n % 2 == 0 || n <= 0) {
                System.out.println("必须输入一个大于0的奇数！");
            } else {
                // 输入合法，跳出循环
                break;
            }
        }

        int mid = n / 2;

        // 上半部分(含中间那行)
        for (int i = 0; i <= mid; i++) {
            // 打印前导空格
            for (int j = 0; j < mid - i; j++) {
                System.out.print(" ");
            }
            // 打印星号（注意这里用 print 而不是 println）
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // 下半部分
        for (int i = mid - 1; i >= 0; i--) {
            // 打印前导空格
            for (int j = 0; j < mid - i; j++) {
                System.out.print(" ");
            }
            // 打印星号
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        sc.close();
    }
}