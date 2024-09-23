/*
 * @Description: 
 * @Author: FallCicada
 * @Date: 2024-09-20 17:11:38
 * @LastEditors: FallCicada
 * @LastEditTime: 2024-09-20 17:25:11
 */
package shape;

public class Rectangle extends Shape {
    private double width;
    private double height;
    
    public Rectangle() {
        
    }
    public Rectangle(String color,double width, double height) {
        super(color);
        this.width = width;
        this.height = height;
    }
    @Override
    public double area() {
        return width * height;
    }
}