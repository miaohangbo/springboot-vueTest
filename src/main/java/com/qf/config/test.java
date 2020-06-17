package com.qf.config;

/**
 * Created by 54110 on 2020/4/21.
 */
public class test {

    public static void main(String[] args) {

        int[] arr = new int[10];

        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = 2 * i + 1;
        }

        System.out.print("调用方法之前");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        insertNum(arr,4,25);
        System.out.print("调用方法之后");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    /**
     * 在已知数组中指定位置插入指定元素
     *
     * @param arr 已知数组
     * @param position 指定的位置 int类型
     * @param num 指定的元素 int类型
     */
    public static void insertNum(int[] arr, int position, int num) {
        int temp = arr[position - 1];
        // 把从指定位置开始的元素，下标加1
        for (int i = arr.length - 1; i > position; i--) {
            arr[i] = arr[i - 1];
        }
        arr[position] = temp;
        arr[position -1] = num;
    }
}
