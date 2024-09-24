/*
 * @Description: 
 * @Author: FallCicada
 * @Date: 2024-09-21 18:16:13
 * @LastEditors: FallCicada
 * @LastEditTime: 2024-09-24 17:42:30
 */
interface Inner {
    void show();



    
}

class Outer {
    // 使用匿名内部类返回一个实现了 Inner 接口的实例
    public static Inner method() {
        return new Inner() {
            @Override
            public void show() {
                System.out.println("HelloWorld");
            }
        };
    }
}

class Test2_2_InnerClass {
    public static void main(String[] args) {
        Outer.method().show();
    }
}