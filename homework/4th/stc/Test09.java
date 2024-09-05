/*
 * @Description: 
 * @Author: FallCicada
 * @Date: 2024-09-04 21:14:08
 * @LastEditors: FallCicada
 * @LastEditTime: 2024-09-04 21:17:40
 */
// 给定一个整型数组和一个目标值，要求编写一个函数来查找数组中第一个大于给定值的元素。如果找到，则返回该元素的索引；如果未找到，则返回-1。
import java.util.Arrays;
import java.util.Scanner;

public class Test09 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        System.out.println("arr: " + Arrays.toString(arr));
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入要查找的数字: ");
        int num = scanner.nextInt();

        int index = findFirstBata(arr, num);

        if (index != -1) {
            System.out.println("找到的第一个大于 " + num + " 的元素的索引为：" + (index + 1));
        } else {
            System.out.println("-1");
        }
    }

    static int findFirstBata(int[] arr, int num) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > num) {
                return i;
            }
        }
        return -1;
    }
}