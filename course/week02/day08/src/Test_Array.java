/*
 * @Description: ArrayTest
 * @Author: FallCicada
 * @Date: 2024-09-04 10:14:03
 * @LastEditors: FallCicada
 * @LastEditTime: 2024-09-04 10:52:03
 */
import java.util.Arrays;
public class Test_Array {
    //main方法
    public static void main(String[] args) {
        //TODO 数组定义方法
        /* 数据类型[] 数组名 = new 数据类型[数组长度];(推荐)
            int [] arr = new int[5];
            double [] arr2 ;
            数据类型 数据名[]
            int  arr3[] = new int[3];
            double arr4[] = {1.2,2.3,3.4,4.5};
            动态初始化 初始化一个长度为3的数组
            这里的new是为数组分配内存空间，所以长度必须要有
            可以大于等于0 但一般大于0 不能为负数
        */
        int [] arr = new int[5];
        // 静态初始化(常规版)
        int [] arr2 =new int[] {1,2,3,4,5};
        //静态初始化(简化版)
        int [] arr3 = {1,2,3,4,5};
        // 错误：不能指定数组长度
        //int [] arr4 = new int[5]{1,2,3,4,5};
        //错误：不能分两行书写
        //int [] arr5
        //arr5 = {1，2，3，4，5};
        //注意错误写法
        int[] arr8 ;
        arr8 = new int[3];
        System.out.println("arr8" + arr8);
        System.out.println("arr8" + Arrays.toString(arr8));
        System.out.println("arr8" + arr8.length);
        //获取数组元素的值
        for (int i = 0; i < arr8.length; i++) {
            System.out.println("arr8[" + i + "] = " + arr8[i]+"\t");
        }
        for (int i = 0; i < arr8.length; i++) {
            arr8[i] = i;
            System.out.println("arr8[" + i + "] = " + arr8[i] + "\t");
        }
    }
}