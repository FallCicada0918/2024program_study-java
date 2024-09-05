/*
 * @Description: 
 * @Author: FallCicada
 * @Date: 2024-09-04 19:27:47
 * @LastEditors: FallCicada
 * @LastEditTime: 2024-09-04 19:51:08
 */
public class Test03 {
    //根据数组的第一个和第二个元素的大小关系确定最大值和次大值从，第三个元素开始依次比较和最大值、次大值的大小关系，确定是否需要改变最大值和次大值的值
    public static void main(String[] args) {
        int[] a = new int[]{1,2,3,4};
        secondMax(a);
    }
    static void secondMax(int[] arr){
        // 初始化最大值和次大值
        int max = 0;
        int secondMax = 0;
        // 检查数组长度
        if (arr.length < 2) {
            System.out.println("数组至少需要两个元素");
            return;
        }
        // 首先确定前两个元素的最大值和次大值
        if (arr[0] > arr[1]) {
            max = arr[0];
            secondMax = arr[1];
        } else {
            max = arr[1];
            secondMax = arr[0];
        }
        // 从第三个元素开始遍历
        for (int i = 2; i < arr.length; i++) {
            if (arr[i] > max) {
                secondMax = max;
                max = arr[i];
            } else if (arr[i] > secondMax && arr[i] != max) {
                secondMax = arr[i];
            }
        }
        System.out.println("最大值为 ：" + max);
        System.out.println("次大值为：" + secondMax);
    }
}