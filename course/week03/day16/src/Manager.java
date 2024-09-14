/*
 * @Description: 
 * @Author: FallCicada
 * @Date: 2024-09-14 09:23:35
 * @LastEditors: FallCicada
 * @LastEditTime: 2024-09-14 09:29:58
 */
//经理类继承员工类
public class Manager extends Employee {
    private double bonus;//奖金
    //构造器
    //无参构造器
    public Manager(){
        //调用父类无参构造器
        super();
    }
    //全参构造器
    public Manager(String name,String id,double bonus){
        super(name,id);
        this.bonus = bonus;
    }
    //重写父类doWork方法
    public void doWork(){
        System.out.println("经理在工作");
    }
     
}