/*
 * @Description: 
 * @Author: FallCicada
 * @Date: 2024-09-04 20:43:59
 * @LastEditors: FallCicada
 * @LastEditTime: 2024-09-05 15:23:23
 */
// 6.	利用随机数生成生成一个长度为20的正整型数组。然后等待用户输入要查找的数字。 
//     1. 如果数组中包含用户输入数字，提示用户数字所在数组下标位置 
//     2. 如果数组中不包含用户输入数字，提示用户数据不存在 
//     3. 用户可以一直进行输入数字，如果用户输入-1，程序停止运行
import java.util.Scanner;
import java.util.Arrays;

public class Test06 {
    public static void main(String[] args) {
        int[] arr = new int[20];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
        }
        System.out.println("数组为：" + Arrays.toString(arr));
        findBeta(arr);
    }

    static void findBeta(int[] arr) {
        try (Scanner sc = new Scanner(System.in)) {
            while (true) {
                System.out.println("请输入一个数字：");
                int num = sc.nextInt();
                if (num == -1) {
                    System.out.println("退出程序");
                    break;
                }
                boolean found = false;
                for (int i = 0; i < arr.length && !found; i++) {
                    if (arr[i] == num) {
                        System.out.println("数据存在, 索引为：" + i);
                        found = true;
                    }
                }
                if (!found) {
                    System.out.println("数据不存在");
                }
            }
        }
    }
}
