/**
 * Test01
 */
public class Test01 {
  public static void main(String[] args) {
    // 接口引用指向实现类的对象
    JDK8IAction a = new JDK8ActionImpl();
    // 调用重写的方法
    a.start();
    a.end();
    // 调用默认方法
    a.dFun();
    // 调用静态方法
    // a.sFun(); // 编译错误 只能通过接口名调用
    JDK8IAction.sFun();
  }

}