/*
 * @Description:Outer3
 * 
 * @Author: rendc
 * 
 * @Date: 2024-09-23 16:50:47
 * 
 * @LastEditors: FallCicada
 * 
 * @LastEditTime: 2024-09-23 19:18:52
 */
/**
 * Outer3
 */
public class Outer3 {
  private int num = 10;

  public void innerFun() {
    final int NUM = 20;
    // 如果局部内部类中使用了这个变量 那么这个变量就是 final 修饰的
    // 从内部类引用的本地变量必须是最终变量
    // 或实际上的最终变量
    // NUM = 300;
    // 定义局部内部类
    class Inner3 {
      private int iNum = 30;

      public void innerTest() {
        System.out.println("innerTest,NUM" + NUM);
        System.out.println("innerTest,this.iNum" + this.iNum);
        System.out.println("innerTest,Outer3.this.num" + Outer3.this.num);
      }
    }
    // 创建局部内部类的对象
    Inner3 inn3 = new Inner3();
    inn3.innerTest();
    System.out.println("Inner3,iNum" + inn3.iNum);
  }
}