package com.tingshuo.core;

/**
 * @description: java综合练习题：2、找质数
 * @author: yangZwt
 * @date: 2026/4/25 16:23
 * @version: 1.0
 */
public class Test2 {
    public static void main(String[] args) {
        // 判断 101-200之间有多少个质数，并打印所有质数
        int count=0;
        for (int i = 101; i <= 200; i++) {
            //System.out.println(i+ " ");
            // 标记法
            boolean flag=true;
            for (int j = 2; j < i; j++) {
                if (i % j   == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag){
                count++;
                System.out.println("是一个质数"+i);
            }
//            else {
//                System.out.println("不是一个质数"+i);
//            }
       }
        System.out.println("共有"+count+"质数");

//        int i = 103;
//        boolean flag = true;
//        for (int j = 2; j < i; j++) {
//            if (i % j   == 0) {
//                flag = false;
//                break;
//            }
//        }
//        if (flag){
//            System.out.println("是一个质数");
//        }else {
//            System.out.println("不是一个质数");
//        }
    }
}
