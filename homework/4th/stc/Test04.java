/*
 * @Description: 
 * @Author: FallCicada
 * @Date: 2024-09-04 20:33:02
 * @LastEditors: FallCicada
 * @LastEditTime: 2024-09-05 14:36:14
 */
import java.util.Random;

public class Test04 {
    public static void main(String[] args) {
        System.out.println(randomCode(4));
    }

static String randomCode(int length) {
    // 使用StringBuilder来构建最终的随机代码字符串
        StringBuilder code = new StringBuilder();
        // 创建一个随机数生成器
        Random random = new Random();
        // 定义包含所有可能字符的字符集
        String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        // 循环指定次数以达到所需的随机代码长度
        for (int i = 0; i < length; i++) {
            // 随机选择字符集中的一个字符的499索引位置
            int index = random.nextInt(chars.length());
            // 将随机选中的字符添加到代码字符串中
            code.append(chars.charAt(index));
        }
        // 返回构建好的随机代码字符串
        return code.toString();
    }
}