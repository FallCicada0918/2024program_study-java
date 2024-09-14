/*
 * @Description: 
 * @Author: FallCicada
 * @Date: 2024-09-14 08:38:54
 * @LastEditors: FallCicada
 * @LastEditTime: 2024-09-14 08:43:35
 */
public class Test05 {
    // 静态变量用于记录所有实例的数量
    private static int Count = 0;

    // 私有构造函数，防止外部直接new
    private Test05() {
        // 每当创建一个新实例时，instanceCount加1
        Count++;
    }

    // 提供一个静态方法，允许外部获取实例数量
    public static int getCount() {
        return Count;
    }

    // 测试代码
    public static void main(String[] args) {
        Test05 obj1 = new Test05();
        Test05 obj2 = new Test05();
        Test05 obj3 = new Test05();

        System.out.println("类实例次数: " + Test05.getCount());
    }
}