package com.tingshuo.day26;

/**
 * @description: java 中数组的定义
 * @author: yangZwt
 * @date: 2026/3/27 19:00
 * @version: 1.0
 */
public class ArrayDemo1 {
    public static void main(String[] args) {
        // 定义数组：
        // 需求：幼儿园有很多孩子
        // 定义 幼儿园孩子的名字 张三、李四、王五
        // 定义 幼儿园孩子的年龄 4、5、6
        // 定义 幼儿园孩子的身高 91.1、92、6、93.3
        // 1.分析 数组
        // 完整格式
        //数据类型 [] 数据名称= new 数据类型[] {元素1，元素2};
        //简写格式
        //数据类型 [] 数组名称 = {元素1，元素2};
        /**
         * 完整格式
         */
        String[] name1 = new String[]{"张三", "李四", "王五"};
        int[] age1 = new int[]{4, 5, 6};
        double[] leigth1 = new double[]{91.1, 92.6, 93.3};
        /**
         * 简化格式
         */
        //姓名
        String[] name = {"张三", "李四", "王五"};
        //年龄
        int[] age = {4, 5, 6};
        //身高
        double[] leigth = {91.1, 92.6, 93.3};
        //2.数组元素访问
        System.out.println(age);
        //System.out.println(leigth);//[D@6bc7c054
        //  2.1.数组的地址值
        /*
        [I@75b84c92 [
        // [ 代表是一个数组
        I 代表 int数据类型
        @ 固定格式
        75b84c92 ：是实际内存中存储的数据 16进制
        */
//        System.out.println(age[0]);
//        System.out.println(age[1]);
//        System.out.println(age[2]);
//        System.out.println(leigth[0]);
//        System.out.println(leigth[1]);
//        System.out.println(leigth[2]);

        //3.数组元素的遍历
        // 数组元素长度下标是从0开始
        //数组元素访问格式：数组名[索引];
        for (int i = 0; i < age.length; i++) {
            System.out.println(age[i]);
        }


    }
}
