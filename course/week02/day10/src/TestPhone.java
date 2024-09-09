/*
 * @Description: 手机类的测试类
 * @Author: rendc
 * @Date: 2024-09-06 14:39:36
 * @LastEditors: rendc
 * @LastEditTime: 2024-09-06 15:14:57
 */
public class TestPhone{
  public static void main(String[] args){
    // 创建一个手机类的对象
    Phone phone = new Phone();
    // 设定品牌
    phone.brand = "小米";
    // 设定价格
    phone.price = 2999.00;
    phone.color = "white";
    phone.sayHello();
    // 创建一个手机类的对象
    Phone phone1 = new Phone();
    // 设定品牌
    phone1.brand = "红米";
    // 设定价格
    phone1.price = 999.00;
    phone1.sayHello();
    phone1.sendMessage("老莫","我要吃鱼");
    phone1.sendMessage("老张","我要吃肉");
  }
}
