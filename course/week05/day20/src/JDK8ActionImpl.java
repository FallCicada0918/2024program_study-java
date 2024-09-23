/*
 * @Description:JDK8ActionImpl
 * 
 * @Author: rendc
 * 
 * @Date: 2024-09-23 14:52:46
 * 
 * @LastEditors: rendc
 * 
 * @LastEditTime: 2024-09-23 14:55:12
 */
/**
 * JDK8ActionImpl
 */
public class JDK8ActionImpl implements JDK8IAction {
  // 重写抽象方法
  @Override
  public void start() {
    System.out.println("重写Start方法");
  }

  @Override
  public void end() {
    System.out.println("重写End方法");
  }
}