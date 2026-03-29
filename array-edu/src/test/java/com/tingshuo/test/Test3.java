package com.tingshuo.test;

/**
 * @description: java数组练习
 * @author: yangZwt
 * @date: 2026/3/29 16:06
 * @version: 1.0
 */
public class Test3 {
    public static void main(String[] args) {
        /*
         *练习3： 变化数据
         * 定义一个数组，存储 1,2,3,4,5,6,7,8,9,10
         * 遍历数组得到每一个元素。
         * 要求：
         * 1.如果是奇数，则将当前数字扩大两倍 *2
         * 2.如果是偶数，则就当前数字变为二分之一 /2
         *
         */
        //1.定义数组
        int [] array={1,2,3,4,5,6,7,8,9,10};
        //2.遍历数组
        for (int i = 0; i < array.length; i++) {
            //3.判断数组是否是奇数或偶数
            //3.1，奇数 *2 偶数 /2
            if (array[i] %2==0){
                //System.out.println(array[i]+"<-偶数");
                array[i]=array[i] /2;
            }else {
                array[i]=array[i] *2;
                //System.out.println(array[i]);
            }
            //System.out.println("-----");
            //这里直接执行也可以
           // System.out.println(array[i]);
        }
    // 1.一个循环里面尽量只做一个事情，条理清楚。绕晕。建议
        System.out.println("=====================");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
