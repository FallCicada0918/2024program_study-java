/*
 * @Description: 
 * @Author: FallCicada
 * @Date: 2024-09-04 19:06:15
 * @LastEditors: FallCicada
 * @LastEditTime: 2024-09-04 19:19:38
 */

import java.util.Arrays;

public class Test01 {
    public static void main(String[] args) {
        //1、先声明再赋值
        char[] arr1 = new char[3];
        arr1[0] = 'a';
        arr1[1] = 'b'; 
        arr1[2] = 'c';
        //2、直接赋值
        char[] arr2 = {'a','b','c'};
        //2、创建并初始化
        char[] arr3 = new char[]{'a','b','c'};
        System.out.println("arr1 = " + Arrays.toString(arr1));
        System.out.println("arr2 = " + Arrays.toString(arr2));
        System.out.println("arr3 = " + Arrays.toString(arr3));
    }
}