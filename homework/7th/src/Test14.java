/*
 * @Description: 图形相关计算
 * @Author: FallCicada
 * @Date: 2024-09-18 17:43:44
 * @LastEditors: FallCicada
 * @LastEditTime: 2024-09-19 16:38:32
 */
class Circle {
    // 属性
    public double radius;

    // 构造器
    public Circle(double radius) {
        this.radius = radius;
    }

    // 计算面积
    public double getArea() {
        return Math.PI * radius * radius;
    }

    // 计算周长
    public double getCircumference() {
        return 2 * Math.PI * radius;
    }

    // 重写toString方法
    @Override
    public String toString() {
        return "圆形 [半径=" + radius + "]";
    }
}

// 圆柱类，继承自Circle
class Cylinder extends Circle {
    // 新增属性
    private double height;

    // 构造器
    public Cylinder(double radius, double height) {
        super(radius); // 调用父类构造器
        this.height = height;
    }

    // 重写父类的getArea方法以计算圆柱的表面积
    @Override
    public double getArea() {
        double baseArea = super.getArea();
        double sideArea = getCircumference() * height;
        return 2 * baseArea + sideArea; // 两个底面加上侧面
    }

    // 新增方法：计算体积
    public double getVolume() {
        return super.getArea() * height;
    }

    // 重写toString方法
    @Override
    public String toString() {
        return "圆柱体信息 [底面半径=" + super.radius + ", 高=" + height + "]";
    }
}

// 测试代码
public class Test14 {
    public static void main(String[] args) {
        // 创建Cylinder对象，但是使用Circle类型的引用
        Circle circleRef = new Cylinder(5, 10);

        // 可以调用父类方法
        System.out.println("圆柱体面积: " + circleRef.getArea());
        System.out.println(circleRef.toString());

        // 尝试调用子类特有的方法会失败，因为circleRef是Circle类型
        // System.out.println("Volume: " + circleRef.getVolume()); // 这行会出错

        // 需要向下转型为Cylinder才能调用getVolume
        if (circleRef instanceof Cylinder) {
            Cylinder cylinder = (Cylinder) circleRef;
            System.out.println("圆柱体体积: " + cylinder.getVolume());
        }
    }
}