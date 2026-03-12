package com.tingshuo.edu.day12;

/**
 * @description: 流程控制 :分支
 * @author: yangZwt
 * @date: 2026/3/12 19:00
 * @version: 1.0
 */
public class SwitchDemo1 {
    public static void main(String[] args) {
        // 今晚下班回去吃什么？用switch 语句实现。流程控制 :分支
        String noodles="北京炸酱面";
        switch (noodles){
            case "兰州拉面":
                System.out.println("吃兰州拉面");
                break;
            case "武汉热干面":
                System.out.println("吃武汉热干面");
                break;
            case "北京炸酱面":
                System.out.println("吃北京炸酱面");
                break;
            case "陕西油泼面":
                System.out.println("吃陕西油泼面");
                break;
            case "山西刀削面":
                System.out.println("吃山西刀削面");
                break;
            case "重庆小面":
                System.out.println("吃重庆小面");
                break;
            default:
                System.out.println("今晚吃泡面吧你。");
                break;
        }
    }
}
