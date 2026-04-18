package com.tingshuo.method;

/**
 * @description: java简单法练习3
 * @author: yangZwt
 * @date: 2026/4/18 9:56
 * @version: 1.0
 */
public class Test3 {
    public static void main(String[] args) {
        // 练习：使用java简单方法打印两个人年龄的和 （年龄计算器）
        getSum();
    }

    public static void getSum() {
        int name1=20;//张三
        int name2=17;//李四，王五
        int result=name1+name2;
        System.out.println("两个人年龄的总和等于:"+result);
    }
}
