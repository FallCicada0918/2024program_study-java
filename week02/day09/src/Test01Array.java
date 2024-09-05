/*
 * @Description: 
 * @Author: FallCicada
 * @Date: 2024-09-05 08:54:46
 * @LastEditors: FallCicada
 * @LastEditTime: 2024-09-05 10:26:11
 */
public class Test01Array {
    public static void main(String[] args) {
        System.out.println("Hello Array");
        int[][] array = new int[2][3];
         // 2表示一维长度，表示这个二维数组包含两个一维数组
         // 3表示二维长度，表示这个二维数组包含的一维数组长度为3
         System.out.println("array[0] = " + array[0]);
         // [I@24d46ca6
         System.out.println("array[1] = " + array[1]);
         // [I@3a71f4dd
        //  System.out.println("array[2] = " + array[2]);//下标越界
        System.out.println("array = " + array);  
        //[[I@7adf9f5f
        // [ 个数表示数组维度
        // I 表示int类型
        // @ 后面的是hashcode     
    }
    
}