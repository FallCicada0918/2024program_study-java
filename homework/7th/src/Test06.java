/*
 * @Description: 
 * @Author: FallCicada
 * @Date: 2024-09-16 11:46:14
 * @LastEditors: FallCicada
 * @LastEditTime: 2024-09-16 11:48:09
 */
//汽车类
class Car{
    public Car(){
        System.out.println("car");
    }
}
    //奥迪类
class Audi extends Car{
    public Audi(){
        System.out.println("audi");
    }
}
public class Test06 {
    public static void main(String[] args){
        Audi a = new Audi();
        Car c = new Car();
    }
}