/*
 * @Description:
 * 
 * @Author: rendc
 * 
 * @Date: 2024-09-25 15:22:46
 * 
 * @LastEditors: rendc
 * 
 * @LastEditTime: 2024-09-25 15:28:11
 */
/**
 * Test04Replace
 */
public class Test04Replace {

  public static void main(String[] args) {
    String str = "Hello, world!";
    String newStr = str.replace('l', 'L');
    String newStr1 = str.replace("world", "Java");
    System.out.println(newStr); // "HeLLo, worLd!"
    System.out.println(newStr1); // "Hello, Java!"

  }
}