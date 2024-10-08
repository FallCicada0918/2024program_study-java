/*
 * @Description: 
 * @Author: FallCicada
 * @Date: 2024-10-08 14:48:32
 * @LastEditors: FallCicada
 * @LastEditTime: 2024-10-08 15:27:07
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
    
    public <F> void disp(F f){
        System.out.println("泛型方法disp返回f : " + f);
    }
    //泛型方法的泛型名尽量不要与泛型类的泛型名相同，容易产生歧义
    public static <F> void show(F f){
        System.out.println("泛型方法show返回f : " + f);
    }
    public static void main(String[] args) {
        //实例化泛型对象
        Circle<Integer, Integer, Integer> circle = new Circle<>(1, 2, 3);
        System.out.println(circle);
        System.out.println(circle.getX());
        System.out.println(circle.getY());
        System.out.println(circle.getRadius());
        circle.disp(6);
        Circle.show("dji");
        
    }
    
}