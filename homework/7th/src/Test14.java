/*
 * @Description: 图形相关计算
 * @Author: FallCicada
 * @Date: 2024-09-18 17:43:44
 * @LastEditors: FallCicada
 * @LastEditTime: 2024-09-18 19:12:41
 */
// 定义圆类 Circle
class Circle {
    private double radius; // 圆的半径属性
    // 构造方法，初始化圆的半径
    public Circle(double radius) {
        this.radius = radius;
    }
    // 获取半径
    public double getRadius() {
        return radius;
    }
    // 设置半径
    public void setRadius(double radius) {
        this.radius = radius;
    }
    // 计算圆的面积
    public double getArea() {
        return Math.PI * radius * radius;
    }
    // 计算圆的周长
    public double getCircumference() {
        return 2 * Math.PI * radius;
    }

    // 重写 toString 方法，返回圆的信息
    @Override
    public String toString() {
        return "Circle [radius=" + radius + "]";
    }
}

// 定义圆柱类 Cylinder，继承自 Circle 类
class Cylinder extends Circle {
    private double height; // 圆柱的高度属性

    // 构造方法，初始化圆柱的半径和高度
    public Cylinder(double radius, double height) {
        super(radius); // 调用父类构造器来初始化半径
        this.height = height;
    }

    // 获取高度
    public double getHeight() {
        return height;
    }

    // 设置高度
    public void setHeight(double height) {
        this.height = height;
    }

    // 重写 getArea 方法，计算圆柱的表面积
    @Override
    public double getArea() {
        // 圆柱的侧面积加上两个底面的面积
        return 2 * Math.PI * getRadius() * height + 2 * ((Circle) this).getArea();
    }

    // 新增计算圆柱体积的方法
    public double getVolume() {
        // 圆柱的体积
        return ((Circle) this).getArea() * height;
    }

    // 重写 toString 方法，返回圆柱的信息
    @Override
    public String toString() {
        return "Cylinder [radius=" + getRadius() + ", height=" + height + "]";
    }
}

public class Test14 {
    public static void main(String[] args) {
        // 创建一个 Cylinder 类的对象，并使用 Circle 类型的引用指向它
        Circle c = new Cylinder(5, 10);

        // 检查引用 c 是否是指向一个 Cylinder 对象
        if (c instanceof Cylinder) {
            // 强制类型转换，从 Circle 类型转换成 Cylinder 类型
            Cylinder cylinder = (Cylinder) c;
            // 输出圆柱的体积
            System.out.println("Volume is: " + cylinder.getVolume());
        } else {
            System.out.println("This is not a Cylinder.");
        }

        // 测试 Circle 类
        Circle circle = new Circle(5);
        System.out.println(circle.toString()); // 输出 Circle 对象的信息
        System.out.println("Circumference is: " + circle.getCircumference()); // 输出圆的周长
        System.out.println("Area is: " + circle.getArea()); // 输出圆的面积

        // 测试 Cylinder 类
        Cylinder cylinder = new Cylinder(5, 10);
        System.out.println(cylinder.toString()); // 输出 Cylinder 对象的信息
        System.out.println("Cylinder Circumference is: " + cylinder.getCircumference()); // 输出圆柱的周长
        System.out.println("Cylinder Area is: " + cylinder.getArea()); // 输出圆柱的表面积
        System.out.println("Volume is: " + cylinder.getVolume()); // 输出圆柱的体积
    }
}