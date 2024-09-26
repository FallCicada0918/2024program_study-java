/*
 * @Description: 
 * @Author: FallCicada
 * @Date: 2024-09-26 09:14:30
 * @LastEditors: FallCicada
 * @LastEditTime: 2024-09-26 10:38:33
 */

import java.util.ArrayList;
import java.util.Collection;

/*
 * Test01Collection
 */
public class Test01Collection {
    // 测试类
    //注解 - 告知编译器忽略unchecked类型警告
    @SuppressWarnings("unchecked")// 忽略警告
    public static void main(String[] args) {
        // 创建一个集合的对象
        // 接口 变量名 = new 实现类(参数);
        // 红线是报错，黄线是警告，警告后续处理
        // 记得导包
        // 在声明集合时，指定泛型参数可以提高代码的可读性和类型安全性
        // Collection<String> collection = new ArrayList<String>();//不忽略警告
        Collection collection = new ArrayList();
        // 判断集合是否为空
        if (collection.isEmpty()) {
          System.out.println("collection is empty");
        }
        collection.add("hello, world");
        // Integer integer = 1;
        // 自动扩容
        collection.add(1);
        collection.add('a');
        System.out.println("collection:" + collection);
        // collection.clear();
        String str = new String("removeMe");
        collection.add(str);
        System.out.println("collection:" + collection);
        System.out.println(collection.size());
        System.out.println(collection.remove(str));// true
        System.out.println(collection.remove(str));// false
        System.out.println(collection.size());
        System.out.println("collection:" + collection);
        // 将单列结合转化成数组
        Object[] objArr = collection.toArray();
        // 遍历数组元素
        for (Object obj : objArr) {
          System.out.println("obj:" + obj);
        }
    }
}