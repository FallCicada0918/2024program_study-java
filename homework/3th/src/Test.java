/*
 * @Description: 
 * @Author: FallCicada
 * @Date: 2024-09-02 19:14:17
 * @LastEditors: FallCicada
 * @LastEditTime: 2024-09-03 18:02:52
 */
import java.util.Scanner;

public class Test {
    /**
     * 程序的主入口点
     * 接收用户输入的数字，并分解质因数
     * 限制输入数字范围在1到14之间（包含边界值）
     * 如果输入数字超出范围，则输出提示信息
     * @param args 命令行参数
     */
    public static void main(String[] args) {
        // 创建Scanner对象，用于接收用户输入
        Scanner scanner = new Scanner(System.in);
        // 接收用户输入的整数
        int num = scanner.nextInt();
        // 检查输入的数字是否在有效范围内
        if (num > 0 && num < 15) {
            // 初始化StringBuilder用于存储质因数分解的结果
            StringBuilder factors = new StringBuilder();
            // 调用printPrimeFactors方法进行质因数分解，结果存储在factors中
            printPrimeFactors(num, factors);
            // 输出质因数分解的结果
            System.out.println(num + " = " + factors.toString());
        } else {
            // 输入的数字不在有效范围内，输出错误提示
            System.out.println("输入数字不符合要求");
        }
    }
    private static void printPrimeFactors(int num, StringBuilder factors) {
        // 临时变量，用于在质因数分解过程中逐步除以因数
        int tempNum = num;
        // 从2开始遍历到num，寻找所有的质因数
        for (int i = 2; i <= num; i++) {
            // 当tempNum能被当前因数i整除时，进入循环
            while (tempNum % i == 0) {
                // 将当前因数追加到结果字符串中
                factors.append(i);
                // 如果tempNum除以i的商大于1，说明还有未分解的因数，追加分隔符
                if (tempNum / i > 1) {
                    factors.append(" × ");
                }
                // 更新tempNum为tempNum除以i的商，继续分解
                tempNum /= i;
            }
        }
    }
}