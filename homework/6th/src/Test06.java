/*
 * @Description: 
 * @Author: FallCicada
 * @Date: 2024-09-13 17:16:51
 * @LastEditors: FallCicada
 * @LastEditTime: 2024-09-13 17:22:34
 */
class B {
    public static B b = new B();
    public static B b2 = new B();
    {
        System.out.println("构造块");
    }
    static {
        System.out.println("静态块");
    }
}
    public class Test06 {
    public static void main(String[] args) {
        B b = new B();
    }
}
    
    