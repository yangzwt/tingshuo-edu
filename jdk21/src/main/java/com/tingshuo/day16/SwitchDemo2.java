package com.tingshuo.day16;

/**
 * @description: switch演示: case穿透
 * @author: yangZwt
 * @date: 2026/3/17 18:38
 * @version: 1.0
 */
public class SwitchDemo2 {
    public static void main(String[] args) {
        // 2.case穿透:就是没有写break;
        /*
         * 执行流程:
         * 首先还是会继续拿着表达式的值跟下面的case进行逐个匹配
         * 如果匹配上了,就会执行对应的语句体,如果没有发现break,那么程序会继续执行到下一个case的语句体,
         * 一直遇到break或者大括号为止.
         * 使用场景:
         *  如果多个case的语句体重复了,我们可以使用case穿透去简化代码.
         */

        int number = 10;
        switch (number) {
            case 1:
                System.out.println("number的值为1");
                break;
            case 10:
                System.out.println("number的值为10");
//                break;
            case 20:
                System.out.println("number的值为20");
//                break;
            default:
                System.out.println("number的值,不为1也不为20");
//                break;
        }
    }
}
