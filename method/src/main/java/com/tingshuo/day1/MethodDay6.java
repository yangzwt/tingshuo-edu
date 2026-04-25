package com.tingshuo.day1;

/**
 * @description: java方法在内存的使用情况
 * @author: yangZwt
 * @date: 2026/4/25 9:50
 * @version: 1.0
 */
public class MethodDay6 {
    public static void main(String[] args) {
        // 学会分辨栈内存、堆内存（new关键字）
        int number=18;//栈
        System.out.println("我的年龄是："+number+"岁");
        eat();//先进后出，后进先出
        //数组,引用数据类型
        int [] array={100,200,300};//我的存款w，堆内存
        System.out.println(array);//[I@75b84c92
        int [] array2=array;
        System.out.println(array2);
        for (int i = 0; i < array.length; i++) {
            System.out.print("array="+array[i]+ " ");
        }
        for (int i = 0; i < array2.length; i++) {
            System.out.print("array2==="+array2[i]+ " ");
        }
    }
    public static void eat() {
        work();
        System.out.println("我爱吃饭");
        sleep();
    }
    public static void work() {
        System.out.println("我爱工作");
    }
    public static void sleep() {
        System.out.println("我爱睡觉");
    }
}
