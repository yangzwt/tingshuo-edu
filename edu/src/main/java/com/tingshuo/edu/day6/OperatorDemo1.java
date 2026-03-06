package com.tingshuo.edu.day6;

/**
 * @description: 算术运算符：练习字符串 和 字符
 * @author: yangZwt
 * @date: 2026/3/6 19:06
 * @version: 1.0
 */
public class OperatorDemo1 {
    public static void main(String[] args) {
        /*
         * 字符串相加：
         * 当 “+”操作中出现字符串时，这个 + 是字符串连接符，而不是算术运算符了，会将前后的数据进行拼接，并产生一个新的字符。
         * 例如： result =“123”+123 问？ 246 / 123123
         * 连续进行 + 操作时，从左到右逐个执行。
         * 例如： 1+ 99 +“听说能变强” 问？ 100听说能变强 /199听说能变强。
         * 字符相加：
         * 当 字符 + 字符 /字符+数字 时，会把字符通过ASCII码表查询到数字，再计算。
         * 例如： 1 +‘a’ // 98/ 1a 98。
         * 'a'+"abc" // abc /97abc ?
         */
        // 字符串 +
        System.out.println("123"+123);//问？ 246 / 123123

        System.out.println(1 + 99 +"听说能变强");//问？ 100听说能变强。 /199听说能变强。



        // 字符 +
        System.out.println(1+'a');  //问 98/ 1a ?
        System.out.println('a'+"abc");//问 abc /97abc ?


    }
}
