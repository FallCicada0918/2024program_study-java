/*
 * @Description: Bus
 * @Author: rendc
 * @Date: 2024-09-23 09:28:31
 * @LastEditors: rendc
 * @LastEditTime: 2024-09-23 09:30:30
 */
/**
 * Bus
 */
public class Bus extends Automobile {
  private int seatNumber;

  // 构造器
  public Bus() {
  }

  public Bus(String brand, String plateNumber, int seatNumber) {
    super(brand, plateNumber);
    this.seatNumber = seatNumber;
  }

  // 计算租金
  @Override
  public int getRent(int days) {
    int rent = 0;
    if (seatNumber <= 16) {
      rent = 400 * days;
    } else {
      rent = 600 * days;
    }
    return rent;
  }
}