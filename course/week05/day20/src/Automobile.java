/*
 * @Description: Automobile
 * @Author: rendc
 * @Date: 2024-09-23 09:12:44
 * @LastEditors: rendc
 * @LastEditTime: 2024-09-23 09:26:44
 */
/**
 * Automobile - 汽车类
 */
public class Automobile {
  private String brand;
  private String plateNumber;

  // 构造器
  public Automobile() {
  }

  public Automobile(String brand, String plateNumber) {
    this.brand = brand;
    this.plateNumber = plateNumber;
  }

  public String getBrand() {
    return brand;
  }

  public String getPlateNumber() {
    return plateNumber;
  }

  public void setBrand(String brand) {
    this.brand = brand;
  }

  public void setPlateNumber(String plateNumber) {
    this.plateNumber = plateNumber;
  }

  // 计算租金的方法
  public int getRent(int days) {
    return 0;
  }
}