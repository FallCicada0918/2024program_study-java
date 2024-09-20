/*
 * @Description: 接口
 * @Author: FallCicada
 * @Date: 2024-09-20 10:28:33
 * @LastEditors: FallCicada
 * @LastEditTime: 2024-09-20 10:28:37
 */
public interface IAction {
    //数据成员
    int NUM = 10;
    //默认为常量,上下两行代码效果一致,等价于
    //public static final int NUM = 10;
    //成员方法
    void start();
    //抽象方法,默认为public abstract
    //等价于public abstract void start();
    public abstract void end();

}