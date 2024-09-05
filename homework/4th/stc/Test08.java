/*
 * @Description: 
 * @Author: FallCicada
 * @Date: 2024-09-04 21:01:31
 * @LastEditors: FallCicada
 * @LastEditTime: 2024-09-04 21:11:52
 */
import java.util.Scanner;
import java.util.Arrays;

public class Test08 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        System.out.println("arr: " + Arrays.toString(arr));
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入要查找的数字: ");
        int num = scanner.nextInt();
        int index = findIndex(arr, num);
        if (index != -1) {
            System.out.println("您要找的元素已找到，其索引为：" + (index + 1));
        } else {
            System.out.println("-1");
        }
    }
    
    static int findIndex(int[] arr, int num) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                return i;
            }
        }
        return -1;
    }
}
