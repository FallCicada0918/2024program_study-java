/*
 * @Description: 
 * @Author: FallCicada
 * @Date: 2024-09-27 21:30:24
 * @LastEditors: FallCicada
 * @LastEditTime: 2024-09-27 21:33:31
 */

import java.util.ArrayList;
import java.util.List;

/**
 * 定义两个集合，完成List集合的定义和遍历。
 *【要求】
 * 定义⼀个集合list1存⼊20个随机整数筛选list1中的偶数元素
 * 定义⼀个集合list2⽤来接收筛选出的偶数元素遍历list2
 */
public class Test4_1 {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<Integer>();
        List<Integer> list2 = new ArrayList<Integer>();

        for (int i = 0; i < 20; i++) {
            list1.add((int)(Math.random() * 100));
        }
        for (int i = 0; i < list1.size(); i++) {
            if (list1.get(i) % 2 == 0) {
                list2.add(list1.get(i));
            }
        }
        System.out.println(list1);
        System.out.println(list2);
        for (int i = 0; i < list2.size(); i++) {
            System.out.println(list2.get(i));
        }
        
    }
    
}