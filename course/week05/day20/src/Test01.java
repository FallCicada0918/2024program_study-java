/*
 * @Description: 
 * @Author: FallCicada
 * @Date: 2024-09-23 14:57:03
 * @LastEditors: FallCicada
 * @LastEditTime: 2024-09-23 15:02:56
 */
public class Test01 {
    public static void main(String[] args) {
        //接口引用指向实例对象
        JDK8IAction a = new JDK8IActionImpl();
        //调用接口抽象方法
        a.start();
        //调用接口抽象方法
        a.end();
        //调用默认方法
        a.defun();
        //调用静态方法
        JDK8IAction.sfun();
    }
}

