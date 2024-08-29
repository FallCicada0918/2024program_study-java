/*
 * @Description: Test类
 * @Author: FallCicada
 * @Date: 2024-08-29 08:47:07
 * @LastEditors: rendc
 * @LastEditTime: 2024-08-29 10:41:06
 */
public class Test{
    public static void main(String[] args){
      System.out.println("Test-Hello");
      // 进制
      byte b1 = 0b01100001;
      byte b2 = 0141;
      byte b3 = 97;
      byte b4 = 0x61;
      System.out.println("b1: " + b1);
      System.out.println("b2: " + b2);
      System.out.println("b3: " + b3);
      System.out.println("b4: " + b4);
      // 数据类型转换
      // int类型值 赋值给 long类型
      long num = 10;
      System.out.println("num: " + num);
  
      // 小类型赋值给大类型
      double price = 8.0F;
      System.out.println("price: " + price);
  
      // 大类型赋值给小类型 - 报错
      // int length = 10.5;
      // System.out.println("length: " + length);
      // byte\short\char类型在做算术运算时
      // 会自动提升为int类型 然后再参与计算
      byte b = 10;
      short s = 5;
      // short sum = b + s;
      // 从int转换到short可能会有损失
      // System.out.println("sum: " + sum);
      int sum = b + s;
      System.out.println("sum: " + sum);
      // 
      byte byte1 = 10;
      short short1 = 5;
      double double1 = 1.0;
      double t = (byte1 - 5) * short1 + double1;
      System.out.println("t: " + t);
      // 强制类型转换（显式类型转换）
      float float1 = (float)3.14;
      float float2 = (float)((byte1 - 5) * short1 + double1);
      System.out.println("float1: " + float1);
      System.out.println("float2: " + float2);
    }
  }