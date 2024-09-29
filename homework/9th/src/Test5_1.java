/*
 * @Description: 
 * @Author: FallCicada
 * @Date: 2024-09-27 22:06:02
 * @LastEditors: FallCicada
 * @LastEditTime: 2024-09-29 17:00:58
 */

import java.util.Comparator;
import java.util.TreeSet;

/**
 * 将1-10按照奇数在前偶数在后，奇数正序，偶数倒序的方式
 * 保存到Set集合中（排序）
 */
public class Test5_1 {
    /**
     * 主函数入口
     * 本函数演示了如何使用TreeSet以及自定义比较器
     * @param args 命令行参数
     */
    public static void main(String[] args) {
        // 使用自定义比较器创建TreeSet实例
        TreeSet<Integer> set = new TreeSet<>(new CustomComparator());
        
        // 添加1-10的所有数字
        for (int i = 1; i <= 10; i++) {
            set.add(i);
        }
        
        // 打印结果
        System.out.println(set);
    }
    
    // 自定义比较器类
    static class CustomComparator implements Comparator<Integer> {
        @Override
        public int compare(Integer o1, Integer o2) {
            // 判断是否为奇数
            boolean isO1Odd = o1 % 2 != 0; // 将o1与2取模后判断是否不等于0，从而确定o1是否为奇数
            boolean isO2Odd = o2 % 2 != 0; // 将o2与2取模后判断是否不等于0，从而确定o2是否为奇数
            
            // 如果都是奇数或都是偶数，则根据数值大小比较
            if (isO1Odd == isO2Odd) { // 比较两个布尔值是否相等，即判断o1和o2是否同为奇数或同为偶数
                if (isO1Odd) { // 当o1为奇数时
                    // 奇数正序
                    return o1.compareTo(o2); // 使用Integer对象的compareTo方法按自然顺序比较o1和o2
                } else {
                    // 偶数倒序
                    return o2.compareTo(o1); // 使用Integer对象的compareTo方法按自然顺序比较o2和o1，实现倒序排列
                }
            } else {
                // 奇数排在偶数前面
                return isO1Odd ? -1 : 1; // 当o1为奇数时返回-1（表示o1小于o2），否则返回1（表示o1大于o2）
            }
        }
    }
}