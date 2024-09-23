/*
 * @Description:Test02
 * 
 * @Author: rendc
 * 
 * @Date: 2024-09-23 15:27:45
 * 
 * @LastEditors: rendc
 * 
 * @LastEditTime: 2024-09-23 16:26:37
 */
/**
 * Test02
 */
// java.util.ArrayList
public class Test02 {
  public static void main(String[] args) {
    // 创建一个外部类的对象
    Outer out = new Outer();
    // 创建一个内部类的对象
    // Outer.Inner inn = out.new Inner();
    // inn.show();

    // // 创建一个内部类的对象
    // Outer.Inner inn2 = new Outer().new Inner();
    // inn2.show();
    out.disp();
  }
}