/*
 * @Description: 测试类
 * @Author: FallCicada
 * @Date: 2024-09-19 14:52:17
 * @LastEditors: FallCicada
 * @LastEditTime: 2024-09-19 15:08:32
 */
public class Test03{
    public static void main(String[] args) {
        //向上转型 子类对象指向父类引用
        Base base = new Derived();
        //访问成员方法
        System.out.println("base.n = " + base.n);
        //编译时看左边,父类中没有v
        // System.out.println("base.v = " + base.v);
        // base.show();
        // base.disp();
        //成员方法
        //运行时看右边,调用子类中的方法
        base.show();
        //编译时看左边 父类中没有 编译报错
        // base.disp();
        
        
        //向下转型
        Derived derived = (Derived)base;
        //访问成员变量
        System.out.println("derived.n = " + derived.n);
        System.out.println("derived.v = " + derived.v);
        //成员方法
        derived.show();
        derived.disp();


        Base base1 = new Fork();
        Fork fork = (Fork)base1;
        fork.out();
    }
}