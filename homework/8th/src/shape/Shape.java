/*
 * @Description: 
 * @Author: FallCicada
 * @Date: 2024-09-20 17:09:37
 * @LastEditors: FallCicada
 * @LastEditTime: 2024-09-20 17:22:39
 */
package shape;

public abstract class Shape {
    private String color;
    public Shape() {
    }
    public Shape(String color) {
        this.color = color;
    }
    public abstract double area();
    public String getColor(){
        return color;
    }
}