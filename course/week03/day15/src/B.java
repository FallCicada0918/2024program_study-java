/*
 * @Description: 
 * @Author: FallCicada
 * @Date: 2024-09-13 10:40:03
 * @LastEditors: FallCicada
 * @LastEditTime: 2024-09-13 10:40:08
 */
//package date15;

public class B extends C {
    private double money;
    public String house;
    public double getMoney(){
        return money;

    }
    public void setMoney(double money){
        this.money=money;
    }
    public String getHouse(){
        return house;

    }
    public void setHouse(String house){
        this.house=house;
    }
    public void sayHello(){
        System.out.println("父亲的房子是："+house+",父亲有："+money+"个小目标");
    }

    public void fishing(){
        System.out.println("爸爸喜欢钓鱼");
    }
}
