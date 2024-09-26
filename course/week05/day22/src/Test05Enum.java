/*
 * @Description:
 * 
 * @Author: rendc
 * 
 * @Date: 2024-09-25 15:37:31
 * 
 * @LastEditors: rendc
 * 
 * @LastEditTime: 2024-09-25 15:52:37
 */
/**
 * Test05Enum
 */
public class Test05Enum {

  public static void main(String[] args) {
    // 实例化枚举类的对象
    Gender gender1 = Gender.MALE;
    // 枚举对象的取值，只能是枚举元素
    Gender gender2 = Gender.FEMALE;
    System.out.println(gender1);
    // 默认输出枚举元素名称字符串
    System.out.println(gender2);
    gender1.setDesc("性别");
    System.out.println(gender1.getDesc());
  }
}