package com.company.loopfor;
import java.util.Scanner;
public class forDemo6 {
    //数列S(n)=1-2+3-4+...输出S(n)为多少
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第n项：");
        int n = sc.nextInt();
        int times=1;
        if (n > 0) {
            double sum=0;
            for(int i=1;i<=n;i++){
                sum+=i*times;
                times*=-1;
            }System.out.println(sum);
        } else System.out.println("输入不合法");
    }
}