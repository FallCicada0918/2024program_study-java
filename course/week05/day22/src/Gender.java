/*
 * @Description:枚举类 - 性别
 * 
 * @Author: rendc
 * 
 * @Date: 2024-09-25 15:34:31
 * 
 * @LastEditors: rendc
 * 
 * @LastEditTime: 2024-09-25 15:49:43
 */
/**
 * Gender
 */
public enum Gender {
  // 第一行有效代码必须是枚举元素
  MALE, FEMALE;

  // 数据成员
  private String desc;

  // 成员方法
  public String getDesc() {
    return desc;
  }

  public void setDesc(String desc) {
    this.desc = desc;
  }

  // 构造器 - 注意必须用private修饰
  private Gender() {
  }

  private Gender(String desc) {
    this.desc = desc;
  }

}