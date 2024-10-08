/*
 * @Description: 该程序统计字符串中每个字符出现的次数.
 * @Author: FallCicada
 * @Date: 2024-10-06 13:11:03
 * @LastEditors: FallCicada
 * @LastEditTime: 2024-10-08 08:32:04
 */

import java.util.HashMap;
import java.util.Map;

public class Test8_2 {
    public static void main(String[] args) {
        String s = "aabbddccaefdd";
        Map<Character, Integer> charCountMap = new HashMap<>();

        // 遍历字符串中的每个字符，并统计其出现的次数
        for (char c : s.toCharArray()) {
            // 如果字符c已经在charCountMap中，则获取其当前的计数值，否则返回0，然后加1
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        }

        // 输出每个字符及其出现的次数
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}