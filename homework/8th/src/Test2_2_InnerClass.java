/*
 * @Description: 
 * @Author: FallCicada
 * @Date: 2024-09-21 18:16:13
 * @LastEditors: FallCicada
 * @LastEditTime: 2024-09-24 17:23:26
 */
class Outer {
    // 使用内部类实现 show 方法
    public static class Inner {
        public void show() {
            System.out.println("HelloWorld");
        }
    }

    // 返回内部类的实例
    public static Inner method() {
        return new Inner();
    }
}

class Test2_2_InnerClass {
    public static void main(String[] args) {
        Outer.method().show();
    }
}