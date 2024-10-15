/*
 * @Description: 
 * @Author: FallCicada
 * @Date: 2024-10-15 14:59:32
 * @LastEditors: FallCicada
 * @LastEditTime: 2024-10-15 15:11:23
 * @: 無限進步
 */

import java.io.Serializable;

public class Student implements Serializable {
    private String name;
    private int age;

    public Student(){

    }
    
    public Student(String name, int age){
        this.name = name;
    }
    
    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public int getAge(){
        return this.age;
    }

    public void study(){
        System.out.println("study");
    }
    
    public void show(){
        System.out.println("name: " + this.name + " age: " + this.age);
    }
    @Override
    public String toString() {
        return "Student [name=" + name + ", age=" + age + "]";
    }

    

}
