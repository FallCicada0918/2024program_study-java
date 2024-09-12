/*
 * @Description: 
 * @Author: FallCicada
 * @Date: 2024-09-11 15:03:16
 * @LastEditors: FallCicada
 * @LastEditTime: 2024-09-11 15:14:12
 */

class Car{
    String color;
    String brand;
    String price;

    public void moveForward(){
        System.out.println("前进");
    }

    public void back(){
        System.out.println("后退");
    }

    public void turn(){
        System.out.println("转弯");
    }

    public void show(){
        System.out.println("颜色:" + color + ";品牌:" + brand +";价格:" + price);
    }
}