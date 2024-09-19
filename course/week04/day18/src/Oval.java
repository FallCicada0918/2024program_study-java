/*
 * @Description: 椭圆形继承点
 * @Author: FallCicada
 * @Date: 2024-09-19 10:45:17
 * @LastEditors: FallCicada
 * @LastEditTime: 2024-09-19 10:45:21
 */
public class Oval extends Point{
    //椭圆的短半轴
    public int a;
    //椭圆的长半轴
    public int b;
    //椭圆的构造器
    public Oval(){
        this.a = 0;
        this.b = 0;
    }
    public Oval(int x, int y, int a, int b){
        super(x,y);
        this.a = a;
        this.b = b;
    }
    public void show(){
        System.out.println("椭圆圆心点的坐标x" + x + "椭圆圆心点坐标y" + y +  "椭圆的短半轴a:" + a + " 椭圆的长半轴b:" + b);
    }    
}