package com.tingshuo.test;

/**
 * @description: 求最值
 * @author: yangZwt
 * @date: 2026/4/10 18:56
 * @version: 1.0
 */
public class ArrayTest4 {
    public static void main(String[] args) {
        // 分析：max为什么不能为 0出现负数时无法确定，最大值，需要取出对应的数组里面元素某个值
        // 循环中的开始条件一定是0吗？ 不是，可以从数组中任意一个一个元素。
        // 遍历数组 int i = 0；开始，可以从1开始，减少一次遍历，提高效率
        // 1.定义数组
        int[] array = {10, 8, 29, 33, 66};//静态数组
        // 2.遍历数组,标记法
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            // 第一次 int i=0 时：10  10  10  29  33  该场比赛中最厉害的战斗力是:66
            // 第二次 int i=1 时：：10  10  29  33  该场比赛中最厉害的战斗力是:66
            System.out.print(max+"  ");
            // 3.数组比较
            if (array[i] > max) {
                max = array[i];
            }
        }
        // 4，打印最大值即可
        System.out.println("该场比赛中最厉害的战斗力是:"+max);
    }
}
