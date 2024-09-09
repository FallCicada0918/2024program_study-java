/*
 * @Description: 
 * @Author: FallCicada
 * @Date: 2024-09-04 14:54:56
 * @LastEditors: FallCicada
 * @LastEditTime: 2024-09-04 16:22:02
 */
import java.util.Arrays;
import java.util.Scanner;
public class Test_test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 用户定义数组长度
        System.out.println("请输入数组长度：");
        int length = scanner.nextInt();
        // 声成该长度数组
        int[] arr = new int[length];
        for (int i = 0; i < length; i++) {
            System.out.println("请输入第" + (i+1) + "个数：");
            arr[i] = scanner.nextInt();
        }
        System.out.println("您生成的数组Array = " + Arrays.toString(arr));
        arrAvg(arr);
        System.out.println("您输入的数组的最大值为 = " + arrMax(arr));
    }
    static void arrAvg(int[] arr){
        double sum = 0;
        for(int i = 0; i < arr.length; i++){
            sum += arr[i];
        }
        System.out.println("您输入数组的平均值 = " + sum/arr.length);
    }
    static int arrMax(int[] arr){
        // 定义一个变量，用于记录最大值
        int max = arr[0];
        // 定义一个索引变量，用于记录最大值在数组中的索引
        int index = 0;
        // 循环遍历数组
        for(int i = 1; i < arr.length; i++){
            // 判断当前元素是否大于最大值
            if(arr[i] > max){
                // 将最大的数值赋给max
                max = arr[i];
            }
            // 将最大值索引赋给index
            index = i;
        }
        System.out.println("最大值下标为：" + "[" + (index + 1) + "]");
        return max;
    }
}