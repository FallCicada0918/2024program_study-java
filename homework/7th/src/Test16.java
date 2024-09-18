/*
 * @Description: 
 * @Author: FallCicada
 * @Date: 2024-09-18 19:24:19
 * @LastEditors: FallCicada
 * @LastEditTime: 2024-09-18 19:24:23
 */
class A {
    int x = 10;
    void show() {
        System.out.println("A: " + x);
    }
}
class B extends A {
    int x = 20;
    void show() {
        System.out.println("B: " + x);
    }
}
public class Test16 {
    public static void main(String[] args) {
        A a = new B();
        a.show();
        System.out.println("A: " + a.x);
        System.out.println("B: " + ((B)a).x);
    }
}
