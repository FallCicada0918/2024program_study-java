/*
 * @Description: 
 * @Author: FallCicada
 * @Date: 2024-09-20 17:17:41
 * @LastEditors: FallCicada
 * @LastEditTime: 2024-09-20 17:22:56
 */
package shape;
public class Circle extends Shape {
    private double radius;
    
    public Circle() {
        
    }
    public Circle(String color,double radius) {
        super(color);
        this.radius = radius;
    }
    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
    
}