/*
 * @Description: 
 * @Author: FallCicada
 * @Date: 2024-10-09 11:06:52
 * @LastEditors: FallCicada
 * @LastEditTime: 2024-10-09 11:40:44
 */

import java.util.ArrayList;

/**
 * ArrayList去除集合中字符串的重复值(字符串的内容相同则代表重复)
 */
public class Test3_1 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("hello");
        arrayList.add("world");
        arrayList.add("hello");
        arrayList.add("java");
        arrayList.add("hello");
        ArrayList<String> newList = new ArrayList<>();
        newList.contains(newList);
        for(String str : arrayList){
            if(!newList.contains(str)){
                newList.add(str);
            }
        }
        System.out.println(arrayList);
        System.out.println(newList);
    }
}