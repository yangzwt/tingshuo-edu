package com.tingshuo.edu.day2;

/**
 * @description: 计算公交车上下乘客和最后终点站的乘客结果？
 * @author: yangZwt
 * @date: 2026/2/28 21:00
 * @version: 1.0
 */
public class VariableTest {
    public static void main(String[] args) {
        // 开始没有一个乘客
        int count = 0;
        // 第一站： 上去一位乘客
        count = count + 1;
        // 第二站： 上去两位乘客，下来一位乘客
        count = count + 2 - 1;
        // 第三站： 上去两位，下来一位乘客
        count = count + 2 - 1;
        // 第四站： 下来一位乘客
        count = count - 1;
        // 第五站： 上去一位乘客
        count = count + 1;
        // 最后公交车到站，有多少为乘客
        System.out.println("最后乘客总数是：" + count);//3
    }

}
