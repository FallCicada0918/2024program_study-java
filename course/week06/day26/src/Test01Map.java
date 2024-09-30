/*
 * @Description: 
 * @Author: FallCicada
 * @Date: 2024-09-30 08:56:34
 * @LastEditors: FallCicada
 * @LastEditTime: 2024-09-30 10:15:06
 */

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * Test01Map
 */
public class Test01Map {

    public static void main(String[] args) {
        //创建一个Map对象
        Map<Integer,String> map = new HashMap<>();
        //给map添加元素
        map.put(1, "zs");
        map.put(2, "ls");
        map.put(3, "ww");
        map.put(4, "5 ");
        map.put(1, "zl");//key值相同所以，zl将zs覆盖
        //输出map
        System.out.println(map);
        System.out.println(map.size());
        //判断key value是否存在
        System.out.println(map.containsKey(1));
        System.out.println(map.containsKey(5));
        System.out.println(map.containsValue(5));
        System.out.println(map.containsValue("5"));
        //根据key去查询value
        // String name = map.get(1);
        // System.out.println(name);
        //根据kay去删除键对
        // map.remove(1);
        // System.out.println(map);
        // map.clear();
        // System.out.println(map);
        //遍历
        // 1. 先获取key值   `keySet();`
        Set<Integer> keys = map.keySet();
        for(Integer key : keys){
            System.out.println("Id:" +key+ " "+ ";name:" +map.get(key));
        }
        // for(Integer key : map.keySet()){
        //     System.out.println(key+ " " +map.get(key));
        // }
        // 2. `get(key);`
        // 3. `for size()` \  `for-reach`
        //第2种遍历思路  
        Set<Entry<Integer,String>> entrySet = map.entrySet();
        for(Entry<Integer,String> entry : entrySet){
            System.out.println(entry);
            Integer key = entry.getKey();
            String value = entry.getValue();
            System.out.println("id: " + key + ",name: " + value);
            System.out.println("Id:" + entry.getKey()+"；name:"+entry.getValue());
        }
        

    }
}