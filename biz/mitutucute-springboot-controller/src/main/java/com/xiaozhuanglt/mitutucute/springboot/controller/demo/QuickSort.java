package com.xiaozhuanglt.mitutucute.springboot.controller.demo;

import com.alibaba.fastjson.JSONObject;

public class QuickSort {
    public static int count = 0;

    public static void main(String[] args) {
        int[] arr = {3,5,8,2,0,4,6,11,5,6,15,1};
        quickSort(arr,0,arr.length-1);
        System.out.println(JSONObject.toJSONString(arr));
        System.out.println(count);
    }

    public static void quickSort(int[] arr,int left,int right){

        if (left > right) {
            return;
        }

        //定义基准数
        int base = arr[left];
        //定义i指向最左边
        int i = left;
        //定义j指向最右边
        int j = right;

        while (i != j) {

            //由j从右往左检索，遇到比base 小的就停下
            while (arr[j] >= base && i < j) {
                count ++;
                j --;
            }
            count ++;
            //由i从左往右检索，遇到比base大大就停下
            while (arr[i] <= base && i < j) {
                count ++;
                i ++;
            }
            count ++;
            //交换i 和 j 的元素
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        //交换base 和 i/j位置的元素
        arr[left] = arr[i];
        arr[i] = base;

        //递归调用相同排序方式
        //排arr[i] 左边的部分
        quickSort(arr,left,i-1);
        //排arr[j]右边的部分
        quickSort(arr,j+1,right);
    }

}
