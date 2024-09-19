/*
 * @Description: 派生类
 * @Author: FallCicada
 * @Date: 2024-09-19 14:47:50
 * @LastEditors: FallCicada
 * @LastEditTime: 2024-09-19 14:52:08
 */
public class Derived extends Base{
    //成员变量
    int n = 2;//同名
    int v = 20;
    @Override
    public void show(){
        System.out.println("Derived中的n = " + n);
        System.out.println("Derived中的n = " + v);
    }
    public void disp(){
        System.out.println("Derived中的v = " + v);
    }
}