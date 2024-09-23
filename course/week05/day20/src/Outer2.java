/*
 * @Description:Outer2
 * 
 * @Author: rendc
 * 
 * @Date: 2024-09-23 16:20:33
 * 
 * @LastEditors: rendc
 * 
 * @LastEditTime: 2024-09-23 16:39:44
 */
/**
 * Outer2
 */
public class Outer2 {
  private int oNum = 10;
  private static int sNum = 20;

  static class Inner2 {
    private int iNum = 30;
    private static int iStaticNum = 40;

    public static void staticFun() {
      // 静态成员方法只能访问外部类的静态成员
      // System.out.println("Outer2,oNum: " + oNum);
      System.out.println("Outer2,sNum: " + sNum);
    }

    void show() {
      // 静态内部类方法中只能访问外部类的static成员
      // System.out.println("Inner2,oNum: " + oNum);
      System.out.println("Inner2,sNum: " + sNum);
      System.out.println("Inner2,Outer2.sNum: " + Outer2.sNum);
    }
  }

  // 外部类中访问静态内部类中的成员和方法
  public void disp() {
    // 创建内部类实例
    Inner2 inner2 = new Inner2();
    System.out.println("Outer2,inner2.iNum" + inner2.iNum);
    System.out.println("Outer2,inner2.iStaticNum" + inner2.iStaticNum);
    System.out.println("Outer2,Inner2.iStaticNum" + Inner2.iStaticNum);
  }

}