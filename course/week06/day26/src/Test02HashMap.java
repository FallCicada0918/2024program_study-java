/*
 * @Description: 
 * @Author: FallCicada
 * @Date: 2024-09-30 10:24:25
 * @LastEditors: FallCicada
 * @LastEditTime: 2024-09-30 10:55:00
 */


import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * 题目：
 *      实例化一个HashMap对象，key的类型是Student值的类型是String，测试常用方法，以及两种遍历方式
 *      并且测试键和值可以为null
 * 
 */
public class Test02HashMap {
    public static void main(String[] args) {
        Map<Student,String> map = new HashMap<>();
        Student s1 = new Student("张三", 18);
        Student s2 = new Student("李四", 19);
        Student s3 = new Student("王五", 20);
        Student s4 = new Student("赵六", 21);
        map.put(s1, "张三");
        map.put(s2, "李四");
        map.put(s3, "王五");
        map.put(s4, "赵六");
        System.out.println(map.get(s4));
        System.out.println(map);
        System.out.println(map.size());
        System.out.println(map.containsKey(s4));
        System.out.println(map.containsValue("王五"));
        System.out.println(map.containsValue("王五1"));
        Set<Student> keys = map.keySet();
        for(Student key : keys){
            System.out.println("Id:" +key+ " "+ ";name:" +map.get(key));
        }
        System.out.println(map.remove(s4));
        System.out.println(map);
        
        
        for(Entry<Student,String> entry : map.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}