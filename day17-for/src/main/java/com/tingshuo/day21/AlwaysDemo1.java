package com.tingshuo.day21;

/**
 * @description: java循环中的无限循环
 * @author: yangZwt
 * @date: 2026/3/22 13:23
 * @version: 1.0
 */
public class AlwaysDemo1 {
    public static void main(String[] args) {
        /**
         * 练习：使用for，while，do while 循环:打印我要学习，一直不断的学习
         *
         */
//        for (; ; ) {
//            System.out.println("我要学习，一直不断的学习");
//        }

//        while (true){
//            System.out.println("我要学习，一直不断的学习");
//        }

//        do {
//            System.out.println("我要学习，一直不断的学习");
//        }while (true);

        while (true){
            System.out.println("我要学习，一直不断的学习");
        }
        // 注意实现：无限循环的后边不能跟对应的需要执行的语句，永远不会执行。
        //System.out.println("循环结束");
    }
}
