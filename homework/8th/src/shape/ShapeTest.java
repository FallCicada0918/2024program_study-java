/*
 * @Description: 
 * @Author: FallCicada
 * @Date: 2024-09-20 17:19:27
 * @LastEditors: FallCicada
 * @LastEditTime: 2024-09-20 17:25:16
 */
package shape;
public class ShapeTest {
    public static void main(String[] args) {
    Shape rectangle = new Rectangle("Red", 2.0, 3.0);
    Shape circle = new Circle("Blue", 5);
    System.out.println(rectangle.getColor());
    System.out.println("Area: " + rectangle.area());
    System.out.println();
    System.out.println(circle.getColor());
    System.out.println("Area: " + circle.area());
    }
}