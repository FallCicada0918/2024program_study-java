/*
 * @Description: 
 * @Author: FallCicada
 * @Date: 2024-09-13 10:39:58
 * @LastEditors: FallCicada
 * @LastEditTime: 2024-09-13 10:40:03
 */


public class Animal {
   private String name;
   public int number;
   public Animal(){
      System.out.println("Animal的无参构造器");
   }
   public Animal(String name){
      this.name=name;
      System.out.println("Animal的有参构造器");
   }
   public Animal(String name,int number){
      this.name=name;
      this.number=number;
      System.out.println("Animal俩有参构造器");
   }

   public void setName(String name){
    this.name=name;
   }
   public String getName(){
    return name;
   }
   public void setNumeber(int number){
    this.number=number;
   }
   public int getNumber(){
    return number;
   }
   public void sayHello(){
      System.out.println("我是"+name+"，我的编号是"+number);
   }

    
}