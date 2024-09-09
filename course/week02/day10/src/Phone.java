/*
 * @Description: 手机类
 * @Author: rendc
 * @Date: 2024-09-06 14:35:30
 * @LastEditors: rendc
 * @LastEditTime: 2024-09-06 15:13:33
 */
public class Phone{
  // 属性
  // 品牌
  String brand;
  // 价格
  double price;
  // 颜色
  String color;
  // 方法
  public void call(String name){
    System.out.println("给"+name+"打电话");
  }
  // 发短信
  public void sendMessage(String name,String message){
    System.out.println("给"+name+"发短信："+message);
  }
  public void sayHello(){
    System.out.println("手机品牌："+brand+"，价格："+price);
  }
}