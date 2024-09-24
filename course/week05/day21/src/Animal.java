/*
 * @Description: 
 * @Author: FallCicada
 * @Date: 2024-09-24 09:18:22
 * @LastEditors: FallCicada
 * @LastEditTime: 2024-09-24 09:19:44
 */
public abstract class Animal{
    private String name;
    public Animal(){
        
    }
    public Animal(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public abstract void eat();
    public abstract void sleep();
    
}