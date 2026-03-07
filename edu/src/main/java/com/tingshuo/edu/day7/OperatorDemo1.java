package com.tingshuo.edu.day7;

/**
 * @description: 运算符：自增和自减运算符 单独使用 和 参与计算
 * @author: yangZwt
 * @date: 2026/3/7 15:24
 * @version: 1.0
 */
public class OperatorDemo1 {
    public static void main(String[] args) {
        // ++
        // --
        /*
         * 单独使用场景
         * 注意事项：
        ++ 和 - - 既可以放在变量的前面，也可以放在变量的后边。
         */
        int a =10;
        ++a;
        System.out.println(a);// 值是多少 11
        System.out.println("---华丽的分割符-----------");
        a++;
        System.out.println(a); // 值是多少 12
        System.out.println("---华丽的分割符-----------");
        --a;
        System.out.println(a);// 值是多少 11
        System.out.println("---华丽的分割符-----------");
        a--;
        System.out.println(a); // 值是多少 10
        System.out.println("---华丽的分割符-----------");
        /* 结论
         * 单独使用: ++ 和 - - 无论是放在变量的前面还是后边，单独写一行的运行结果是一样的。
         */


    }
}
