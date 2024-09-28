/*
 * @Description: 
 * @Author: FallCicada
 * @Date: 2024-09-27 22:06:02
 * @LastEditors: FallCicada
 * @LastEditTime: 2024-09-27 22:24:32
 */

import java.util.HashSet;
import java.util.LinkedHashSet;

import java.util.Set;

/**
 * 将1-10按照奇数在前偶数在后，奇数正序，偶数倒序的
 * ⽅式保存到Set集合中（排序）
 */
public class Test5_1 {
    public static void main(String[] args) {
        Set<Integer> set = new LinkedHashSet<>();
        for (int i = 1; i <= 10; i++) {
            if (i % 2 != 0) {
                set.add(i);
            }
        }
        System.out.println(set);
        for (int i = 10; i >= 1; i--) {
            if (i % 2 == 0) {
                set.add(i);
            }
        }
        System.out.println(set);
        
    }
    
}