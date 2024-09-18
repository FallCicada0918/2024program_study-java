/*
 * @Description: 
 * @Author: FallCicada
 * @Date: 2024-09-18 15:53:12
 * @LastEditors: FallCicada
 * @LastEditTime: 2024-09-18 15:55:48
 */
// 抽象类 Automobile 定义了汽车的基本属性和抽象方法 getRent
abstract class Automobile {
    private String brand; // 品牌
    private String plateNumber; // 车牌号
    // 构造方法
    public Automobile(String brand, String plateNumber) {
        this.brand = brand;
        this.plateNumber = plateNumber;
    }

    // 抽象方法，用于计算租赁费用
    public abstract int getRent(int days);

    // 获取品牌
    public String getBrand() {
        return brand;
    }

    // 获取车牌号
    public String getPlateNumber() {
        return plateNumber;
    }
}

// Truck 类继承自 Automobile，表示卡车
class Truck extends Automobile {
    private String size; // 卡车大小

    // 构造方法
    public Truck(String brand, String plateNumber, String size) {
        super(brand, plateNumber);
        this.size = size;
    }

    // 实现抽象方法 getRent，根据卡车大小计算租金
    @Override
    public int getRent(int days) {
        int rent = 0;
        switch (size) {
            case "小型": // 小型卡车每日租金为 300 元
                rent = 300 * days;
                break;
            case "中型": // 中型卡车每日租金为 350 元
                rent = 350 * days;
                break;
            case "大型": // 大型卡车每日租金为 500 元
                rent = 500 * days;
                break;
            default: // 如果卡车大小无效，则抛出异常
                throw new IllegalArgumentException("Invalid truck size");
        }
        return rent;
    }
}

// Bus 类继承自 Automobile，表示公交车
class Bus extends Automobile {
    private int seats; // 座位数

    // 构造方法
    public Bus(String brand, String plateNumber, int seats) {
        super(brand, plateNumber);
        this.seats = seats;
    }

    // 实现抽象方法 getRent，根据座位数计算租金
    @Override
    public int getRent(int days) {
        int rent = 0;
        if (seats <= 16) { // 座位数小于等于16的公交车每日租金为 400 元
            rent = 400 * days;
        } else { // 座位数大于16的公交车每日租金为 600 元
            rent = 600 * days;
        }
        return rent;
    }
}

// 主类 Test09_automobile
public class Test09_automobile {
    public static void main(String[] args) {
        // 创建一个中型卡车对象
        Truck t = new Truck("北汽", "苏U12345", "中型");
        // 计算租赁3天的租金
        int rent = t.getRent(3);
        // 输出卡车信息和租金
        System.out.println(t.getBrand() + "\t" +
                           t.getPlateNumber() + " 租金为：" + rent);
        // 输出：北汽 苏U12345 租金为：1050

        // 创建一个拥有30个座位的公交车对象
        Automobile b = new Bus("宇通", "苏A11111", 30);
        // 计算租赁10天的租金
        int busRent = b.getRent(10);
        // 输出公交车信息和租金
        System.out.println(b.getBrand() + "\t" +
                           b.getPlateNumber() + " 租金为：" + busRent);
        // 输出：宇通 苏A11111 租金为：6000
    }
}