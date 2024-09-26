/*
 * @Description:
 * 
 * @Author: rendc
 * 
 * @Date: 2024-09-25 15:12:15
 * 
 * @LastEditors: rendc
 * 
 * @LastEditTime: 2024-09-25 15:16:52
 */
/**
 * Test03Substring
 */
public class Test03Substring {

  public static void main(String[] args) {
    String str = "Hello, world!";
    // String newStr = str.substring(0, 5); // Hello[0,5)
    // 以下两行代码效果一致
    String newStr = str.substring(0); // Hello, world!
    // String newStr = str.substring(0, str.length()); // Hello, world!
    System.out.println(newStr);
  }
}