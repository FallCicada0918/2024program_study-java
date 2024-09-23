/*
 * @Description: Outer
 * 
 * @Author: rendc
 * 
 * @Date: 2024-09-23 15:08:02
 * 
 * @LastEditors: rendc
 * 
 * @LastEditTime: 2024-09-23 16:18:46
 */
/**
 * Outer
 */
// 类 - 外部类
public class Outer {
  // 外部类 - 成员属性
  private int oNum = 10;
  private int num = 20;

  /**
   * Inner - 内部类 - 成员内部类
   */
  public class Inner {
    // 成员属性
    private int iNum = 30;
    private int num = 40;

    // 成员方法
    void show() {
      // 内部类的方法可以直接访问外部类的成员
      System.out.println("Inner,oNum: " + oNum); // 10
      int num = 50;
      // 内部类中的访问依旧遵循就近原则
      System.out.println("Inner,num: " + num); // 50
      // 内部类中的this仍然指向自己内部类
      System.out.println("Inner,this.num: " + this.num); // 40
      // 如果内部类和外部类有同名的成员，那么通过外部类类名指定访问外部类的成员
      System.out.println("Inner,Outer.this.num: " + Outer.this.num); // 20
    }
    // 在成员内部类中不能定义静态成员变量和成员方法
    // public static int newNum = 10;
    // public static void sayHello(){}

  }

  // 外部类 - 成员方法
  public void disp() {
    // 实例化一个内部类 Inner 的对象
    // Outer.Inner inner = new Outer().new Inner();
    // Outer.Inner inner = this.new Inner();
    Inner inner = new Inner();
    System.out.println("Outer,inner.iNum = " + inner.iNum); // 30
  }
}