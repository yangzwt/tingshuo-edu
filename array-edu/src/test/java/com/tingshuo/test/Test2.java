package com.tingshuo.test;

/**
 * @description: java数组的练习2
 * @author: yangZwt
 * @date: 2026/3/29 16:02
 * @version: 1.0
 */
public class Test2 {
    public static void main(String[] args) {
        /*
         * 练习2：
         * 定义一个数组，存储1,2,3,4,5,6,7,8,9,10
         * 遍历数组得到每一个数组元素，统计数组里面有多少个可以被3整除的数字。
         */
        //1.定义数组
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        //2.循环遍历数组
        // 标记法
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            //3.判断数组是否能被3整除 % 3 ==0
            if (array[i] % 3 == 0) {
                //System.out.println(array[i]);
                count++;
            }
        }
        System.out.println(count);

    }
}
