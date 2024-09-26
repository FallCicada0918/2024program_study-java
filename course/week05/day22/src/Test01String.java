/*
 * @Description: 
 * @Author: FallCicada
 * @Date: 2024-09-26 10:37:37
 * @LastEditors: FallCicada
 * @LastEditTime: 2024-09-26 10:37:37
 */
/*
 * @Description:String
 * 
 * @Author: rendc
 * 
 * @Date: 2024-09-25 10:34:40
 * 
 * @LastEditors: rendc
 * 
 * @LastEditTime: 2024-09-25 14:48:47
 */

import javax.swing.plaf.synth.SynthStyle;

/**
 * Test01String
 */
public class Test01String {
  public static void main(String[] args) {
    // 创建一个空白的字符串对象
    String s1 = new String();
    // 空白的字符串对象，不含有任何内容
    System.out.println("s1:" + s1);
    // 根据字符数组的内容，创建字符串对象
    char[] chs = { 'a', 'b', 'c' };
    System.out.println("chs:" + chs);
    String s2 = new String(chs);
    System.out.println("s2:" + s2);
    // 根据一个字符串，直接创建字符串对象
    String s3 = new String("123");
    System.out.println("s3:" + s3);
    // 直接赋值的方式创建字符串
    String s4 = "Hello";
    System.out.println("s4:" + s4);
    String s5 = "Hello";
    System.out.println("s5:" + s5);
    System.out.println(s4 == s5);
    String s6 = new String("Hello").intern();
    System.out.println(s4 == s6);
    String s7 = "Hello" + "Hello";
    String s8 = "HelloHello";
    System.out.println(s7 == s8); // true
    String s9 = s4 + s5;
    System.out.println(s7 == s9); // false
    String s10 = (s4 + s5).intern();
    System.out.println(s7 == s10); // true
    int s9Length = s9.length();
    System.out.println(s9Length);
    System.out.println(s10.length());
    char[] charArr = s10.toCharArray();
    System.out.println("charArr:" + charArr);
    // for (int i = 0; i < charArr.length; i++) {
    // System.out.println(charArr[i]);
    // }
    // 增强for循环
    // for (char c : charArr) {
    // System.out.println("c:" + c);
    // }
    String charStr = new String(charArr);
    System.out.println("charStr:" + charStr);
  }

}