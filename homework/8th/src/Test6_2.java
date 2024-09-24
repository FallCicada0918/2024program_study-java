/*
 * @Description: 
 * @Author: FallCicada
 * @Date: 2024-09-23 20:26:02
 * @LastEditors: FallCicada
 * @LastEditTime: 2024-09-23 21:04:45
 */
class A {
    
}
class B extends A {

    void test() {
        // 打印父类的简单名称，super关键字表示当前类的父类
        System.out.println(super.getClass().getSimpleName());
        // 打印当前类的简单名称，this关键字表示当前对象
        System.out.println(this.getClass().getSimpleName());
        
    }
    public static void main(String[] args) {
            B b = new B();
            b.test();
    }
}
