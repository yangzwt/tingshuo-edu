package com.tingshuo.day21;

/**
 * @description: java中的循环结构，跳出循环
 * @author: yangZwt
 * @date: 2026/3/22 13:24
 * @version: 1.0
 */
public class JumpOutDemo1 {
    public static void main(String[] args) {
        /**
         * 跳出循环练习：continue
         * 练习1:
         * 小老虎吃包子，吃到第三个有虫子的结束，吃其他的。
         * tiger, eat,bun，err
         */
        int bun = 5;
        int eat = 1;
        int count = 0;
        while (eat <= bun) {
            if (eat == 3) {
                eat++;
                continue;
            }
            System.out.println("小老虎再吃第" + eat + "个包子");
            count++;
            // 再吃下一个,正常包子
            eat++;

        }
        System.out.println("小老虎吃了" + count + "个包子");
        System.out.println("for循环============");
        int sum=0;
        for (int i = 1; i <=5 ; i++) {
            if (i==3){
                continue;
            }
            sum++;
            System.out.println("小老虎再吃第" + i + "个包子");
        }
        System.out.println("小老虎吃了" + sum + "个包子");
    }
}
