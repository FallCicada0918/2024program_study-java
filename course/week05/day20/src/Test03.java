/*
 * @Description:Test03
 * 
 * @Author: rendc
 * 
 * @Date: 2024-09-23 16:40:13
 * 
 * @LastEditors: rendc
 * 
 * @LastEditTime: 2024-09-23 16:48:50
 */

/**
 * Test03
 */
public class Test03 {

  public static void main(String[] args) {
    // 创建一个类的对象
    Outer2.Inner2 inn2 = new Outer2.Inner2();
    inn2.show();
    //
    Outer2 out2 = new Outer2();
    out2.disp();
    // 静态内部类的static方法也是可以通过类名调用的，但是要加外部类名
    Outer2.Inner2.staticFun();
  }
}