/*
 * @Description: 
 * @Author: FallCicada
 * @Date: 2024-10-08 14:48:32
 * @LastEditors: FallCicada
 * @LastEditTime: 2024-10-08 15:18:41
 */


/**
 * 定义一个泛型类，圆：Circle
 * 成员属性：x,y,radius
 * 成员方法：构造器，get,set，toString
 */
public class Circle<X,Y,R> {
    private X x;
    private Y y;
    private R radius;
    public Circle() {
    
    }
    public Circle(X x, Y y) {
        this.x = x;
        this.y = y;
    }
    public Circle(X x, Y y, R radius) {
        this(x,y);
        this.radius = radius;
    }

    public X getX() {
        return x;
    }

    public void setX(X x) {
        this.x = x;
    }
    
    public Y getY() {
        return y;
    }
    public void setY(Y y) {
        this.y = y;
    }
    public void setRadius(R radius) {
        this.radius = radius;
    }
    public R getRadius() {
        return radius;
    } 
    @Override
    public String toString() {
        return "该圆的属性 = [" +
        "(x=" + x +
        ", y=" + y + ")" +
        ", Radius=" + radius +
        ']';
    }
    
    public static void main(String[] args) {
        //实例化泛型对象
        Circle<Integer, Integer, Integer> circle = new Circle<>(1, 2, 3);
        System.out.println(circle);
        System.out.println(circle.getX());
        System.out.println(circle.getY());
        System.out.println(circle.getRadius());
    }
    
}