/*
 * @Description: 
 * @Author: FallCicada
 * @Date: 2024-09-18 19:15:25
 * @LastEditors: FallCicada
 * @LastEditTime: 2024-09-18 19:16:10
 */
class Father {
    void show() {
        System.out.println("A");
    }
}
class Son extends Father {
    void show() {
        super.show();
        System.out.println("B");
    }
}
public class Test15 {
    public static void main(String[] args) {
        Father f = new Son();
        f.show();
    }
}