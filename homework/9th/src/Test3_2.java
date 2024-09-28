/*
 * @Description: 
 * @Author: FallCicada
 * @Date: 2024-09-27 21:24:12
 * @LastEditors: FallCicada
 * @LastEditTime: 2024-09-27 21:27:24
 */

import java.util.ArrayList;
import java.util.List;
/**
 * 有两个集合list1和list2，list1中存放了1，2，3，4，5五个元素，list2中存放了4，5，6三个元素，按要求完成下列操作
 *   1.	打印list1和list2的交集（list1和list2中都有的元素）
 *   2.	打印list1和list2的差集（list1中有，list2中没有的元素）
 */
public class Test3_2 {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<Integer>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);
        List<Integer> list2 = new ArrayList<Integer>();
        list2.add(4);
        list2.add(5);
        list2.add(6);
        // 交集
        List<Integer> intersection = new ArrayList<Integer>();
        for (Integer i : list1) {
            // 判断list2中是否包含i
            if (list2.contains(i)) {
                // 添加到交集中
                intersection.add(i);
            }
        }
        System.out.println("交集：" + intersection);
        // 差集
        List<Integer> difference = new ArrayList<Integer>();
        for (Integer i : list1) {
            // 判断list2中是否不包含i
            if (!list2.contains(i)) {
                // 添加到差集中
                difference.add(i);
            }
        }
        System.out.println("差集：" + difference);
    }
}