package com.tingshuo.method;

/**
 * @description: java使用方法进行数组复制
 * @author: yangZwt
 * @date: 2026/4/24 18:39
 * @version: 1.0
 */
public class Test14 {
    public static void main(String[] args) {
        // 需求 定义一个方法 copyOfRange(int [] arr,int form,int to)
        //功能：将数组arr中从索引from（包含from）开始。
        //到索引to结束（不包含to）的元素复制到新数组中，将新数组返回。
        //定义数组：
        int arr[] = {1,2,3,4,5,6,7,8};
        int[] copyList = copyOfRange(arr, 3, 7);//4,5,6,7
        for (int i = 0; i < copyList.length; i++) {
            System.out.print(copyList[i]+" ");
        }
    }

    public static int[] copyOfRange(int [] arr,int form,int to) {
        int [] newArray=new int [to-form];
        int index=0;
        // 0,1,2,3
        for (int i = form; i < to; i++) {
            newArray[index]=arr[i];
            index++;
        }
        return newArray;
    }

}
