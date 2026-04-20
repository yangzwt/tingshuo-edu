package com.tingshuo.method;

/**
 * @description: java中方法的重载 练习
 * @author: yangZwt
 * @date: 2026/4/20 18:33
 * @version: 1.0
 */
public class Test7 {
    public static void main(String[] args) {
        // 练习：方法的重载：
        // 掌握 1:会判断方法之间是否构成重载关系
        // 掌握 2.会自己定义重载的方法
    }
//    //**第一组，判断 ,不构成 方法重载，与返回值无关
//    public static void getCout(int a) {
//
//    }
//
//    public static int getCout(int b) {
//        return b;
//    }
    //**第二组 ，判断，构成方法重载：返回值无关，和形参有关及形参个数无关
    public static float getCout(int a) {
        float f=0.1f;
        return f;
    }

    public static int getCout(int a,int b) {
        return a+b;
    }
}
