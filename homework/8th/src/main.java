/*
 * @Description: 
 * @Author: FallCicada
 * @Date: 2024-09-20 15:55:47
 * @LastEditors: FallCicada
 * @LastEditTime: 2024-09-21 18:58:34
 */
abstract class A {
    abstract void show();
}
class B extends A {
    void show() {
        System.out.println("B");
    }
}
class main {
    public static void main(String[] args) {
        A a = new B();
        a.show();
    }
} 