/*
 * @Description: 
 * @Author: FallCicada
 * @Date: 2024-09-27 16:03:43
 * @LastEditors: FallCicada
 * @LastEditTime: 2024-09-27 16:19:48
 */

import java.util.ArrayList;
import java.util.List;

/**
 * 假设顺序列表ArrayList中存储的元素是整型数字1~5，遍历每个元素，将每个元素顺序输出。（你能想到的所有⽅式）
 */
public class Test2_1 {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i <= 5; i++) {
            list.add(i);
        }
        System.out.println("集合原始数据");
        System.out.println(list);
        // 使用for循环
        System.out.println("使用for循环遍历");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + "\t");
        }
        System.out.println(" ");
        System.out.println("使用for-each循环遍历");
        // 使用foreach循环
        for (Integer integer : list) {
            System.out.print(integer + "\t");
        }
        System.out.println(" ");
        // 使用stream流
        System.out.println("使用stream流遍历");
        list.stream().forEach(System.out::print);
        System.out.println("\t");
        // 集合转数组遍历
        System.out.println("集合转数组进行遍历");
        Object[] array = list.toArray();
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
        }
        System.out.println(" ");
    }
}