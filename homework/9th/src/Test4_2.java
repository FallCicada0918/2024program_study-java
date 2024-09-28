/*
 * @Description: 
 * @Author: FallCicada
 * @Date: 2024-09-27 21:37:28
 * @LastEditors: FallCicada
 * @LastEditTime: 2024-09-27 22:03:00
 */

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

/**
 * 定义⼀个集合，完成Set集合的定义和遍历。
 *【要求】
 * Set集合中的元素为10个整数10个整数元素为1-20的随机数
 * 10个整数元素互不重复
 */
public class Test4_2 {
    public static void main(String[] args) {
        // 定义一个集合
        System.out.println("集合的元素为10个整数10个整数元素为1-20的随机数");
        Set<Integer> set = new HashSet<>();
        System.out.println("集合的元素个数为：" + set.size());
        Random r = new Random();
        // 循环添加
        System.out.println("开始添加元素");
        for (int i = 0; i < 10; i++) {
            // 添加
            System.out.println("添加元素：" + (r.nextInt(20) + 1));
            set.add(r.nextInt(20) + 1);
        }
        // 遍历
        System.out.println("遍历集合");
        for (Integer i : set) {
            System.out.println(i);
        }
        System.out.println("集合长度：" + set.size());
        System.out.println("集合：" + set);
    }
    
}