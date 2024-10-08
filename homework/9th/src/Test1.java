/*
 * @Description: 
 * @Author: FallCicada
 * @Date: 2024-10-08 09:24:50
 * @LastEditors: FallCicada
 * @LastEditTime: 2024-10-08 09:28:25
 */
import java.util.Collection;
import java.util.Collections;

public class Test1 { // 定义一个名为 Test1 的公共类
    public static <T extends Comparable<? super T>> T max(Collection<? extends T> coll) { 
        // 定义一个泛型方法 max，接受一个类型为 Collection 的参数 coll
        // 该方法是静态的，返回类型为 T
        // <T extends Comparable<? super T>> 表示 T 必须是实现了 Comparable 接口的类型或其子类型
        if (coll == null || coll.isEmpty()) { // 检查 coll 是否为 null 或者是否为空
            throw new IllegalArgumentException("Collection is null or empty"); // 如果是，抛出 IllegalArgumentException 异常
        }
        return Collections.max(coll); // 使用 Collections.max 方法返回集合中的最大元素
    }
}