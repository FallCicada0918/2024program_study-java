/*
 * @Description: 
 * @Author: FallCicada
 * @Date: 2024-09-21 18:16:13
 * @LastEditors: FallCicada
 * @LastEditTime: 2024-09-21 18:16:39
 */
interface Inner {
    void show();
}

class Outer {
    // 返回一个实现了 Inner 接口的匿名内部类实例
    public static Inner method() {
        return new Inner() {
            @Override
            public void show() {
                System.out.println("HelloWorld");
            }
        };
    }
}

public class Test2_2_InnerClass {
    public static void main(String[] args) {
        Outer.method().show(); // 输出 HelloWorld
    }
}