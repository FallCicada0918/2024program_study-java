/*
 * @Description: 
 * @Author: rendc
 * @Date: 2024-09-25 14:54:17
 * @LastEditors: rendc
 * @LastEditTime: 2024-09-25 15:09:21
 */
/**
 * Test02Split
 */
public class Test02Split {

  public static void main(String[] args) {
    String str = "apple,banana,orange";
    // 以下两行代码效果一致
    // String[] fruits = str.split(",");
    // String[] fruits = str.split(",", 0);
    // 看一下第二个参数的效果
    String[] fruits = str.split(",", 4);
    // 增强for循环
    for (String fruit : fruits) {
      System.out.println(fruit);
    }
    // System.out.println("123"+\n+"456");
  }
}