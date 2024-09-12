/*
 * @Description: 
 * @Author: FallCicada
 * @Date: 2024-09-11 15:14:54
 * @LastEditors: FallCicada
 * @LastEditTime: 2024-09-11 15:19:04
 */
public class TestCar{
    public static void main(String[] args) {
        Car car = new Car();
        car.brand = "XiaoMi";
        car.price = "280000" ;
        car.color = "海湾蓝";
        car.show();
        car.moveForward();
        car.back();
        car.turn();
    }
}