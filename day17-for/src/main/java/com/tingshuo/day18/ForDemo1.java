package com.tingshuo.day18;

/**
 * @description: java中的for循环使用累加
 * @author: yangZwt
 * @date: 2026/3/19 18:39
 * @version: 1.0
 */
public class ForDemo1 {
    public static void main(String[] args) {
        /**
         * 练习: 求和
         * 需求:在实际开发中,如果要获取一个范围中的每个数据时,也会用到循环
         * 例如: 求1-5直间的和
         */
        // 1.分析 循环1-5里面的每一个数字,开始条件:1,结束条件5
        int sum=0;
        for (int i = 1; i <=100 ; i++) {
            //int sum = 0;
            //变量的作用范围
            //1.求和的变量不能定义到循环里面.
            // 2.如果变量定义在循环里面,那么当前变量只能在本次循环中有效,
            // 当本次循环结束之后,变量就会从内存中消失.
            // 结论: 如果以后我们在写累加求和的变量,可以把变量定义在循环的外面.
            sum = sum + i;
        }
        System.out.println(sum);
    }
}
