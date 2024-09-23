/*
 * @Description:JDK8IAction
 * 
 * @Author: rendc
 * 
 * @Date: 2024-09-23 14:46:41
 * 
 * @LastEditors: rendc
 * 
 * @LastEditTime: 2024-09-23 15:05:23
 */
/**
 * JDK8IAction
 */
public interface JDK8IAction {
  // public static final
  // 静态常量
  String NUM = "0";

  // 抽象方法
  // public abstract
  void start();

  void end();

  // jdk8中，接口可以添加默认方法和静态方法
  public default void dFun() {
    // 默认方法
    System.out.println("dFun");
  }

  public static void sFun() {
    // 静态方法
    System.out.println("sFun");
  }
  // jdk9中，接口中可以添加私有方法
  // private void newStart(){
  // 在jdk1.8中报错
  // }

}