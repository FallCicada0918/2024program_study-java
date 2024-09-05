/*
 * @Description: 
 * @Author: FallCicada
 * @Date: 2024-09-04 20:53:49
 * @LastEditors: FallCicada
 * @LastEditTime: 2024-09-04 20:57:21
 */
// 1. 产生100个[1,6]之间的随机数，并统计每个数字出现的概率 
// 2. 可以创建2个数组分别保存随机数信息和统计产生次数信息 
// 3. 例如：随机数生成了10个1，20个2，30个3，5个4，10个5，25个6，对应的 
// 统计数组内容[10,20,30,5,10,25]，即统计数组的每一个位置上存放的是对应 
// 下标出现的次数
import java.util.Random;
import java.util.Arrays;
public class Test07 {
    public static void main(String[] args) {
        // 创建一个数组用于保存产生的随机数
        int[] randomNumbers = new int[100];
        // 创建一个数组用于统计每个数字出现的次数
        int[] countArray = new int[6];

        // 生成100个[1,6]之间的随机数并保存到randomNumbers数组中
        Random random = new Random();
        for (int i = 0; i < randomNumbers.length; i++) {
            randomNumbers[i] = random.nextInt(6) + 1;
            // 更新countArray中对应下标的计数值
            countArray[randomNumbers[i] - 1]++;
        }
        System.out.println("生成数组：" + Arrays.toString(randomNumbers));
        // 打印统计结果
        for (int i = 0; i < countArray.length; i++) {
            System.out.println("数字 " + (i + 1) + " 出现次数: " + countArray[i]);
        }
    }

}