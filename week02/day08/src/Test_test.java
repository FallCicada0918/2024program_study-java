/*
 * @Description: 
 * @Author: FallCicada
 * @Date: 2024-09-04 14:54:56
 * @LastEditors: FallCicada
 * @LastEditTime: 2024-09-04 15:08:53
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
    }
    static void arrAvg(int[] arr){
        double sum = 0;
        for(int i = 0; i < arr.length; i++){
            sum += arr[i];
        }
        System.out.println("您输入数组的平均值 = " + sum/arr.length);
    }
}