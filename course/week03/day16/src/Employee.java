/*
 * @Description: 
 * @Author: FallCicada
 * @Date: 2024-09-14 09:17:35
 * @LastEditors: FallCicada
 * @LastEditTime: 2024-09-14 09:18:28
 */

public class Employee {
    private String name;//定义姓名
    private String id;//定义工号
    //构造器
    //无参构造器
    public Employee(){

    }
    //全参构造器
    public Employee(String name,String id){
        this.name = name;
        this.id = id;
    }
    //show
    public void doWork(){
        System.out.println("员工正在工作");
    }
}