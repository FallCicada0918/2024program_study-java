/*
 * @Description: 圆形继承点
 * @Author: FallCicada
 * @Date: 2024-09-19 10:45:17
 * @LastEditors: FallCicada
 * @LastEditTime: 2024-09-19 10:45:21
 */
public class Circle extends Point{
    //半径
    private int radius;
    //构造器
    public Circle(){

    }
    
    public Circle(int x,int y,int radius){
        //第一行有效代码调用父类构造器
        super(x,y);
        this.radius=radius;
    }

    @Override
    public void show(){
        System.out.println("圆心坐标为：" + x + "," + y + " 圆的半径为：" + radius);
    }
}