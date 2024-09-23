/**
 * Truck
 */
public class Truck extends Automobile {
  private String type;

  // 构造器
  public Truck() {
  }

  public Truck(String brand, String plateNumber, String type) {
    super(brand, plateNumber);
    this.type = type;
  }

  // 计算租金
  @Override
  public int getRent(int days) {
    int rent = 0;
    switch (type) {
      case "小型":
        rent = 300 * days;
        break;
      case "中型":
        rent = 350 * days;
        break;
      case "大型":
        rent = 500 * days;
        break;
    }
    return rent;
  }
}