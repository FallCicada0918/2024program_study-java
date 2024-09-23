/*
 * @Description: 
 * @Author: rendc
 * @Date: 2024-09-23 09:25:14
 * @LastEditors: rendc
 * @LastEditTime: 2024-09-23 09:31:44
 */
/**
 * Test09_automobile
 */
public class Test09_automobile {

  public static void main(String[] args) {
    Truck t = new Truck("北汽", "苏U12345", "中型");
    int rent = t.getRent(3);
    System.out.println(t.getBrand() + "\t" + t.getPlateNumber() + " 租金为：" + rent);
    // 输出 北汽 苏U12345 租金为：1050
    Automobile b = new Bus("宇通", "苏A11111", 30);
    int busRent = b.getRent(10);
    System.out.println(b.getBrand() + "\t" + b.getPlateNumber() + " 租金为：" + busRent);
    // 输出 宇通 苏A11111 租金为：6000
  }
}