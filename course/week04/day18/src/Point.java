/*
 * @Description: 点
 * @Author: FallCicada
 * @Date: 2024-09-19 10:29:20
 * @LastEditors: FallCicada
 * @LastEditTime: 2024-09-19 10:29:20
 */
public class Point{
    //点的坐标位置
    public int x;
    public int y;
    public Point(){
        this.x = 0;
        this.y = 0;
    }
    public Point(int x, int y){
        this.x = x;
        this.y = y;
    } 
    public void show(){
        System.out.println("点的横坐标x:" + x + " 点的纵坐标y:" + y);
    }
}