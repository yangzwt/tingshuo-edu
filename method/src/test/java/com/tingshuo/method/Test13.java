package com.tingshuo.method;

/**
 * @description: java方法练习求数组是否包括某个值返回
 * @author: yangZwt
 * @date: 2026/4/21 18:52
 * @version: 1.0
 */
public class Test13 {
    public static void main(String[] args) {
        //练习三：
        //判断是否存在：设计一个方法，判断数组中的某一个数是否存在，将结果返回给调用处；
        int [] arr = {1,2,3,4,5,6};
        // 定义方法用于数组遍历
        //1.我要干嘛？ 遍历数组
        // 2.我干这件事情需要什么才能处理完成? 判断数组中是否存在 int [] ,int number
        // 3.方法的调用，是否需要返回值？ 需要返回值
        boolean contains = contains(arr, 7);
        System.out.println(contains);
    }

    public static boolean contains(int [] args ,int number) {
        for (int i = 0; i < args.length; i++) {
            if (args[i]==number){
               return true;
            }
        }
        return false;
    }
    // 记着：
    // return ：方法结束和方法返回值
    // break  和switch 表示循环的结束。
}
