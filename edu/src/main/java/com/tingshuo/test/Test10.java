package com.tingshuo.test;

/**
 * @description: java 中的if
 * @author: yangZwt
 * @date: 2026/3/13 19:04
 * @version: 1.0
 */
public class Test10 {


    public static void main(String[] args) {
        // if 第一种格式使用
        // 汽车无人驾驶 会涉及到大量的判断
        // 当汽车行驶的时候遇到红绿灯，就会判断
        // 如果红灯亮，就停止 lightRedFlag
        // 如果黄灯亮，就减速 lightYellowFlag
        // 如果绿灯亮，就通行 lightGreedFlag
        //注意： 如果对一个布尔类型的变量进行判断，不要用 == 号，直接把变量写在小括号即可
        boolean lightRedFlag = false;
        boolean lightYellowFlag = false;
        boolean lightGreedFlag = true;
        if (lightRedFlag) {
            System.out.println("stop!!!");
        }
        if (lightYellowFlag){
            System.out.println("请减速!!!");
        }
        if (lightGreedFlag){
            System.out.println("gogo!!!");
        }
    }


}
