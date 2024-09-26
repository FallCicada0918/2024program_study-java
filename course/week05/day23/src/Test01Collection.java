/*
 * @Description: 
 * @Author: FallCicada
 * @Date: 2024-09-26 09:14:30
 * @LastEditors: FallCicada
 * @LastEditTime: 2024-09-26 09:54:05
 */

import java.util.ArrayList;
import java.util.Collection;

/*
 * Test01Collection
 */
public class Test01Collection {
    // 测试类
    @SuppressWarnings("unchecked")// 忽略警告
    public static void main(String[] args) {
        // 创建一个集合的对象
        // 接口 变量名 = new 实现类(参数);
        // 红线是报错，黄线是警告，警告后续处理
        // 记得导包
        // 在声明集合时，指定泛型参数可以提高代码的可读性和类型安全性
        // Collection<String> collection = new ArrayList<String>();//不忽略警告
        Collection collection = new ArrayList();
        //Collection<String> collection = new ArrayList<>();
        collection.add("hello,world");//报错：使用了未经检查或不安全的操作。
        //自动扩容
        collection.add(1);
        collection.add('a');
        //判断集合是否为空
        if(collection.isEmpty()){
            System.out.println("collection is empty");
        }else{
            System.out.println("Collection：" + collection);
        }
    }
}