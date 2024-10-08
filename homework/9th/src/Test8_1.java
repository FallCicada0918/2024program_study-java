/*
 * @Description: 
 * @Author: FallCicada
 * @Date: 2024-10-06 12:30:53
 * @LastEditors: FallCicada
 * @LastEditTime: 2024-10-06 13:06:58
 */

import java.util.HashMap;
import java.util.Map;

public class Test8_1 {
    public static void main(String[] args) {
        // 创建Map集合
        Map<String, Double> fruitPrices = new HashMap<>();
        fruitPrices.put("香蕉", 5.6);
        fruitPrices.put("樱桃", 25.0);
        fruitPrices.put("桃子", 5.6);
        fruitPrices.put("苹果", 2.3);

        // 遍历Map集合并统计水果种类
        System.out.println("使用entrySet遍历:");
        int count = 0;
        for (Map.Entry<String, Double> entry : fruitPrices.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
            count++;
        }
        System.out.println("水果种类数: " + count);

        System.out.println("使用keySet遍历:");
        count = 0;
        for (String key : fruitPrices.keySet()) {
            System.out.println(key + " = " + fruitPrices.get(key));
            count++;
        }
        System.out.println("水果种类数: " + count);

        // 修改“香蕉”的价格为10.9，并删除“桃子”这组数据
        fruitPrices.put("香蕉", 10.9);
        fruitPrices.remove("桃子");
        System.out.println("修改香蕉单价:5.6 => 10.9");
        System.out.println("删除桃子");
        // 输出修改后的Map集合
        System.out.println("修改后的Map集合:");
        count = 0;
        for (Map.Entry<String, Double> entry : fruitPrices.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
            count++;
        }
        System.out.println("水果种类数: " + count);
    }
}