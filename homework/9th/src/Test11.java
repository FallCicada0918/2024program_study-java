/*
 * @Description: 
 * @Author: FallCicada
 * @Date: 2024-10-08 09:45:53
 * @LastEditors: FallCicada
 * @LastEditTime: 2024-10-09 15:35:08
 */

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/**
 * Test11
 */
public class Test11 {
    /**
     * 返回 Collection 中的最大值。
     * 
     * @param <T> 集合中元素的类型，必须实现了 Comparable 接口。
     * @param collection 要查找最大值的 Collection。
     * @return 最大值，如果 Collection 为空，则返回 null。
     */
    public static <T extends Comparable<T>> T max(Collection<T> collection) {
        if (collection == null || collection.isEmpty()) {
            return null;
        }
        T maxElement = null;
        for (T element : collection) {
            if (maxElement == null || element.compareTo(maxElement) > 0) {
                maxElement = element;
            }
        }
        
        return maxElement;
    }
    public static void main(String[] args) {
         // 示例：使用 Integer 类型的 List
        List<Integer> numbers = Arrays.asList(5, 2, 9, 1, 5, 6);
        Integer maxValue = Test11.max(numbers);
        System.out.println(numbers);
        System.out.println("int 类型最大值: " + maxValue);
        
        //示例使用Double类型的List
        List<Double> doubleNumders = Arrays.asList(5.5, 2.2, 9.9, 1.1, 5.5, 6.6);
        Double maxDouble = Test11.max(doubleNumders);
        System.out.println(doubleNumders);
        System.out.println("double 类型最大值: " + maxDouble);

        // 示例：使用 String 类型的 List
        List<String> strings = Arrays.asList("1", "10", "2");
        String maxString = Test11.max(strings);
        System.out.println(strings);
        System.out.println("string 类型最大值: " + maxString);
    }
}