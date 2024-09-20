/*
 * @Description: 
 * @Author: FallCicada
 * @Date: 2024-09-20 10:34:46
 * @LastEditors: FallCicada
 * @LastEditTime: 2024-09-20 10:58:39
 */
public class Test03{
    public static void main(String[] args) {
        // IAction action = new IAction();
        // 接口不可以示实例化对象
        System.out.println(IAction.NUM);
        //接口中的成员变量默认是常量
        //创建一个接口的引用指向接口的实现类
        IAction iAction = new ActiomImpl(); 
        iAction.start();
    }
}