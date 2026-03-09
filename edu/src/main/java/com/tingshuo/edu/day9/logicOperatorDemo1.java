package com.tingshuo.edu.day9;

/**
 * @description: java逻辑运算符 & |
 * @author: yangZwt
 * @date: 2026/3/9 19:06
 * @version: 1.0
 */
public class logicOperatorDemo1 {
    public static void main(String[] args) {
        // 在数学学习中，一个数据x，大于5，小于15，我们可以这样表示：5 < x < 15;
       // 1. & 并且 并且，两边都为真，结果才为真
        System.out.println( true & true); // 结果 true
        System.out.println( false & false); // 结果 false
        System.out.println( true & false); // 结果 false
        System.out.println( false & true); // 结果 false
        // 2. | 或者 或者，两边都为假，结果才是假
        System.out.println( true | true); // 结果 true
        System.out.println( false | false); // 结果 false
        System.out.println( true | false); // 结果  true
        System.out.println( false | true); // 结果 true
    }
}
