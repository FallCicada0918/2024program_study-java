/*
 * @Description: 动物类
 * @Author: rendc
 * @Date: 2024-09-06 16:18:28
 * @LastEditors: rendc
 * @LastEditTime: 2024-09-06 16:24:49
 */
public class Animal{
  // 成员属性
  // 名字
  String name;
  // 类型
  String type;
  // 年龄
  int age;
  // 颜色
  String color;
  // 成员方法
  public void sayHello(){
    System.out.println("我是"+ type+" ，我的名字是"+ name +"， 我的年龄是"+ age +"岁，我的颜色是"+ color+"。");
  }
  public void eat(String food){
    System.out.println(type+"吃"+food);
  }
}
