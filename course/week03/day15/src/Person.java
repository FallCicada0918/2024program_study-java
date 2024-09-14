/*
 * @Description: 类继承的实现
 * @Author: FallCicada
 * @Date: 2024-09-13 09:17:23
 * @LastEditors: FallCicada
 * @LastEditTime: 2024-09-13 09:24:30
 */
public class Person {
    private String name;

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }
    public void sayHello(){
        System.out.println("hello,my name is "+name);
    }
    
}