/*
 * @Description: 
 * @Author: FallCicada
 * @Date: 2024-09-13 17:09:03
 * @LastEditors: FallCicada
 * @LastEditTime: 2024-09-13 17:09:08
 */
class Test {
    public Test() {
        System.out.println("构造器");
    }
    public void info() {
        System.out.println("info");
    }
    static {
        System.out.println("test static 1");
    }
    public static void main(String[] args) {
        new Test().info();
    }
    {
        System.out.println("代码块");
    }
    static {
        System.out.println("test static 2");
    }
}
    