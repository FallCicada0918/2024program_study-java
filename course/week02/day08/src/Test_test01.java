/*
 * @Description: 
 * @Author: FallCicada
 * @Date: 2024-09-04 16:53:51
 * @LastEditors: FallCicada
 * @LastEditTime: 2024-09-04 17:30:39
 */
import java.util.Arrays;
//1.	使用多种不同方式创建数组并初始化，数组包含a、b、c三个元素 
public class Test_test01{
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println("两倍长度arr:" +Arrays.toString(doubleArray(arr)));
    }
    static int[] doubleArray(int[] arr){
         // 创建一个新数组，长度为原数组的两倍
        int[] arr2 = new int[arr.length * 2];
        // 复制原数组内容到新数组的前半部分
        System.arraycopy(arr, 0, arr2, 0, arr.length);
        return arr2;
    }
}